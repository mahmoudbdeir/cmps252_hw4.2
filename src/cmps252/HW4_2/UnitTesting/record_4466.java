package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("1")
class Record_4466 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4466: FirstName is Porfirio")
	void FirstNameOfRecord4466() {
		assertEquals("Porfirio", customers.get(4465).getFirstName());
	}

	@Test
	@DisplayName("Record 4466: LastName is Ryneke")
	void LastNameOfRecord4466() {
		assertEquals("Ryneke", customers.get(4465).getLastName());
	}

	@Test
	@DisplayName("Record 4466: Company is Nixon, R Amanda Esq")
	void CompanyOfRecord4466() {
		assertEquals("Nixon, R Amanda Esq", customers.get(4465).getCompany());
	}

	@Test
	@DisplayName("Record 4466: Address is 33 W Mckey St")
	void AddressOfRecord4466() {
		assertEquals("33 W Mckey St", customers.get(4465).getAddress());
	}

	@Test
	@DisplayName("Record 4466: City is Ocoee")
	void CityOfRecord4466() {
		assertEquals("Ocoee", customers.get(4465).getCity());
	}

	@Test
	@DisplayName("Record 4466: County is Orange")
	void CountyOfRecord4466() {
		assertEquals("Orange", customers.get(4465).getCounty());
	}

	@Test
	@DisplayName("Record 4466: State is FL")
	void StateOfRecord4466() {
		assertEquals("FL", customers.get(4465).getState());
	}

	@Test
	@DisplayName("Record 4466: ZIP is 34761")
	void ZIPOfRecord4466() {
		assertEquals("34761", customers.get(4465).getZIP());
	}

	@Test
	@DisplayName("Record 4466: Phone is 407-654-0567")
	void PhoneOfRecord4466() {
		assertEquals("407-654-0567", customers.get(4465).getPhone());
	}

	@Test
	@DisplayName("Record 4466: Fax is 407-654-4288")
	void FaxOfRecord4466() {
		assertEquals("407-654-4288", customers.get(4465).getFax());
	}

	@Test
	@DisplayName("Record 4466: Email is porfirio@ryneke.com")
	void EmailOfRecord4466() {
		assertEquals("porfirio@ryneke.com", customers.get(4465).getEmail());
	}

	@Test
	@DisplayName("Record 4466: Web is http://www.porfirioryneke.com")
	void WebOfRecord4466() {
		assertEquals("http://www.porfirioryneke.com", customers.get(4465).getWeb());
	}
}
