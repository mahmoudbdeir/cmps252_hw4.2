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

@Tag("48")
class Record_968 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 968: FirstName is Tammi")
	void FirstNameOfRecord968() {
		assertEquals("Tammi", customers.get(967).getFirstName());
	}

	@Test
	@DisplayName("Record 968: LastName is Sherow")
	void LastNameOfRecord968() {
		assertEquals("Sherow", customers.get(967).getLastName());
	}

	@Test
	@DisplayName("Record 968: Company is Mella, James A Esq")
	void CompanyOfRecord968() {
		assertEquals("Mella, James A Esq", customers.get(967).getCompany());
	}

	@Test
	@DisplayName("Record 968: Address is 471 Bement Ave")
	void AddressOfRecord968() {
		assertEquals("471 Bement Ave", customers.get(967).getAddress());
	}

	@Test
	@DisplayName("Record 968: City is Staten Island")
	void CityOfRecord968() {
		assertEquals("Staten Island", customers.get(967).getCity());
	}

	@Test
	@DisplayName("Record 968: County is Richmond")
	void CountyOfRecord968() {
		assertEquals("Richmond", customers.get(967).getCounty());
	}

	@Test
	@DisplayName("Record 968: State is NY")
	void StateOfRecord968() {
		assertEquals("NY", customers.get(967).getState());
	}

	@Test
	@DisplayName("Record 968: ZIP is 10310")
	void ZIPOfRecord968() {
		assertEquals("10310", customers.get(967).getZIP());
	}

	@Test
	@DisplayName("Record 968: Phone is 718-273-5435")
	void PhoneOfRecord968() {
		assertEquals("718-273-5435", customers.get(967).getPhone());
	}

	@Test
	@DisplayName("Record 968: Fax is 718-273-6523")
	void FaxOfRecord968() {
		assertEquals("718-273-6523", customers.get(967).getFax());
	}

	@Test
	@DisplayName("Record 968: Email is tammi@sherow.com")
	void EmailOfRecord968() {
		assertEquals("tammi@sherow.com", customers.get(967).getEmail());
	}

	@Test
	@DisplayName("Record 968: Web is http://www.tammisherow.com")
	void WebOfRecord968() {
		assertEquals("http://www.tammisherow.com", customers.get(967).getWeb());
	}
}
