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

@Tag("20")
class Record_2055 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2055: FirstName is Mariana")
	void FirstNameOfRecord2055() {
		assertEquals("Mariana", customers.get(2054).getFirstName());
	}

	@Test
	@DisplayName("Record 2055: LastName is Girton")
	void LastNameOfRecord2055() {
		assertEquals("Girton", customers.get(2054).getLastName());
	}

	@Test
	@DisplayName("Record 2055: Company is Steven, Ford B Esq")
	void CompanyOfRecord2055() {
		assertEquals("Steven, Ford B Esq", customers.get(2054).getCompany());
	}

	@Test
	@DisplayName("Record 2055: Address is 4241 L B Mcleod Rd")
	void AddressOfRecord2055() {
		assertEquals("4241 L B Mcleod Rd", customers.get(2054).getAddress());
	}

	@Test
	@DisplayName("Record 2055: City is Orlando")
	void CityOfRecord2055() {
		assertEquals("Orlando", customers.get(2054).getCity());
	}

	@Test
	@DisplayName("Record 2055: County is Orange")
	void CountyOfRecord2055() {
		assertEquals("Orange", customers.get(2054).getCounty());
	}

	@Test
	@DisplayName("Record 2055: State is FL")
	void StateOfRecord2055() {
		assertEquals("FL", customers.get(2054).getState());
	}

	@Test
	@DisplayName("Record 2055: ZIP is 32811")
	void ZIPOfRecord2055() {
		assertEquals("32811", customers.get(2054).getZIP());
	}

	@Test
	@DisplayName("Record 2055: Phone is 407-839-5619")
	void PhoneOfRecord2055() {
		assertEquals("407-839-5619", customers.get(2054).getPhone());
	}

	@Test
	@DisplayName("Record 2055: Fax is 407-839-2679")
	void FaxOfRecord2055() {
		assertEquals("407-839-2679", customers.get(2054).getFax());
	}

	@Test
	@DisplayName("Record 2055: Email is mariana@girton.com")
	void EmailOfRecord2055() {
		assertEquals("mariana@girton.com", customers.get(2054).getEmail());
	}

	@Test
	@DisplayName("Record 2055: Web is http://www.marianagirton.com")
	void WebOfRecord2055() {
		assertEquals("http://www.marianagirton.com", customers.get(2054).getWeb());
	}
}
