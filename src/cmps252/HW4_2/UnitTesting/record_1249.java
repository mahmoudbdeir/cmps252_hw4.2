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

@Tag("37")
class Record_1249 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1249: FirstName is Evan")
	void FirstNameOfRecord1249() {
		assertEquals("Evan", customers.get(1248).getFirstName());
	}

	@Test
	@DisplayName("Record 1249: LastName is Cottillion")
	void LastNameOfRecord1249() {
		assertEquals("Cottillion", customers.get(1248).getLastName());
	}

	@Test
	@DisplayName("Record 1249: Company is Gekiere & Assoc")
	void CompanyOfRecord1249() {
		assertEquals("Gekiere & Assoc", customers.get(1248).getCompany());
	}

	@Test
	@DisplayName("Record 1249: Address is 919 Calle Amanecer  #-d")
	void AddressOfRecord1249() {
		assertEquals("919 Calle Amanecer  #-d", customers.get(1248).getAddress());
	}

	@Test
	@DisplayName("Record 1249: City is San Clemente")
	void CityOfRecord1249() {
		assertEquals("San Clemente", customers.get(1248).getCity());
	}

	@Test
	@DisplayName("Record 1249: County is Orange")
	void CountyOfRecord1249() {
		assertEquals("Orange", customers.get(1248).getCounty());
	}

	@Test
	@DisplayName("Record 1249: State is CA")
	void StateOfRecord1249() {
		assertEquals("CA", customers.get(1248).getState());
	}

	@Test
	@DisplayName("Record 1249: ZIP is 92673")
	void ZIPOfRecord1249() {
		assertEquals("92673", customers.get(1248).getZIP());
	}

	@Test
	@DisplayName("Record 1249: Phone is 949-361-6860")
	void PhoneOfRecord1249() {
		assertEquals("949-361-6860", customers.get(1248).getPhone());
	}

	@Test
	@DisplayName("Record 1249: Fax is 949-361-7823")
	void FaxOfRecord1249() {
		assertEquals("949-361-7823", customers.get(1248).getFax());
	}

	@Test
	@DisplayName("Record 1249: Email is evan@cottillion.com")
	void EmailOfRecord1249() {
		assertEquals("evan@cottillion.com", customers.get(1248).getEmail());
	}

	@Test
	@DisplayName("Record 1249: Web is http://www.evancottillion.com")
	void WebOfRecord1249() {
		assertEquals("http://www.evancottillion.com", customers.get(1248).getWeb());
	}
}
