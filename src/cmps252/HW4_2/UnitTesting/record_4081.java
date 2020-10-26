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

@Tag("49")
class Record_4081 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4081: FirstName is Louis")
	void FirstNameOfRecord4081() {
		assertEquals("Louis", customers.get(4080).getFirstName());
	}

	@Test
	@DisplayName("Record 4081: LastName is Arya")
	void LastNameOfRecord4081() {
		assertEquals("Arya", customers.get(4080).getLastName());
	}

	@Test
	@DisplayName("Record 4081: Company is Holiday Inn")
	void CompanyOfRecord4081() {
		assertEquals("Holiday Inn", customers.get(4080).getCompany());
	}

	@Test
	@DisplayName("Record 4081: Address is 338 State Hwy  #-34")
	void AddressOfRecord4081() {
		assertEquals("338 State Hwy  #-34", customers.get(4080).getAddress());
	}

	@Test
	@DisplayName("Record 4081: City is Matawan")
	void CityOfRecord4081() {
		assertEquals("Matawan", customers.get(4080).getCity());
	}

	@Test
	@DisplayName("Record 4081: County is Monmouth")
	void CountyOfRecord4081() {
		assertEquals("Monmouth", customers.get(4080).getCounty());
	}

	@Test
	@DisplayName("Record 4081: State is NJ")
	void StateOfRecord4081() {
		assertEquals("NJ", customers.get(4080).getState());
	}

	@Test
	@DisplayName("Record 4081: ZIP is 7747")
	void ZIPOfRecord4081() {
		assertEquals("7747", customers.get(4080).getZIP());
	}

	@Test
	@DisplayName("Record 4081: Phone is 732-583-5913")
	void PhoneOfRecord4081() {
		assertEquals("732-583-5913", customers.get(4080).getPhone());
	}

	@Test
	@DisplayName("Record 4081: Fax is 732-583-9098")
	void FaxOfRecord4081() {
		assertEquals("732-583-9098", customers.get(4080).getFax());
	}

	@Test
	@DisplayName("Record 4081: Email is louis@arya.com")
	void EmailOfRecord4081() {
		assertEquals("louis@arya.com", customers.get(4080).getEmail());
	}

	@Test
	@DisplayName("Record 4081: Web is http://www.louisarya.com")
	void WebOfRecord4081() {
		assertEquals("http://www.louisarya.com", customers.get(4080).getWeb());
	}
}
