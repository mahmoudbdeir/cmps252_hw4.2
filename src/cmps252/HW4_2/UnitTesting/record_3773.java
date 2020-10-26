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

@Tag("22")
class Record_3773 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3773: FirstName is Cletus")
	void FirstNameOfRecord3773() {
		assertEquals("Cletus", customers.get(3772).getFirstName());
	}

	@Test
	@DisplayName("Record 3773: LastName is Blass")
	void LastNameOfRecord3773() {
		assertEquals("Blass", customers.get(3772).getLastName());
	}

	@Test
	@DisplayName("Record 3773: Company is Arch Metal Fabrications")
	void CompanyOfRecord3773() {
		assertEquals("Arch Metal Fabrications", customers.get(3772).getCompany());
	}

	@Test
	@DisplayName("Record 3773: Address is 1081 John Sims Pky E")
	void AddressOfRecord3773() {
		assertEquals("1081 John Sims Pky E", customers.get(3772).getAddress());
	}

	@Test
	@DisplayName("Record 3773: City is Niceville")
	void CityOfRecord3773() {
		assertEquals("Niceville", customers.get(3772).getCity());
	}

	@Test
	@DisplayName("Record 3773: County is Okaloosa")
	void CountyOfRecord3773() {
		assertEquals("Okaloosa", customers.get(3772).getCounty());
	}

	@Test
	@DisplayName("Record 3773: State is FL")
	void StateOfRecord3773() {
		assertEquals("FL", customers.get(3772).getState());
	}

	@Test
	@DisplayName("Record 3773: ZIP is 32578")
	void ZIPOfRecord3773() {
		assertEquals("32578", customers.get(3772).getZIP());
	}

	@Test
	@DisplayName("Record 3773: Phone is 850-678-4327")
	void PhoneOfRecord3773() {
		assertEquals("850-678-4327", customers.get(3772).getPhone());
	}

	@Test
	@DisplayName("Record 3773: Fax is 850-678-3529")
	void FaxOfRecord3773() {
		assertEquals("850-678-3529", customers.get(3772).getFax());
	}

	@Test
	@DisplayName("Record 3773: Email is cletus@blass.com")
	void EmailOfRecord3773() {
		assertEquals("cletus@blass.com", customers.get(3772).getEmail());
	}

	@Test
	@DisplayName("Record 3773: Web is http://www.cletusblass.com")
	void WebOfRecord3773() {
		assertEquals("http://www.cletusblass.com", customers.get(3772).getWeb());
	}
}
