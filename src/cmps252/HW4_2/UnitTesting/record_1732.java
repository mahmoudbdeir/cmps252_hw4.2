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

@Tag("44")
class Record_1732 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1732: FirstName is Bettye")
	void FirstNameOfRecord1732() {
		assertEquals("Bettye", customers.get(1731).getFirstName());
	}

	@Test
	@DisplayName("Record 1732: LastName is Balsamo")
	void LastNameOfRecord1732() {
		assertEquals("Balsamo", customers.get(1731).getLastName());
	}

	@Test
	@DisplayName("Record 1732: Company is North Hollywood Tool & Mfg Co")
	void CompanyOfRecord1732() {
		assertEquals("North Hollywood Tool & Mfg Co", customers.get(1731).getCompany());
	}

	@Test
	@DisplayName("Record 1732: Address is York River Crossing Shopp")
	void AddressOfRecord1732() {
		assertEquals("York River Crossing Shopp", customers.get(1731).getAddress());
	}

	@Test
	@DisplayName("Record 1732: City is Hayes")
	void CityOfRecord1732() {
		assertEquals("Hayes", customers.get(1731).getCity());
	}

	@Test
	@DisplayName("Record 1732: County is Gloucester")
	void CountyOfRecord1732() {
		assertEquals("Gloucester", customers.get(1731).getCounty());
	}

	@Test
	@DisplayName("Record 1732: State is VA")
	void StateOfRecord1732() {
		assertEquals("VA", customers.get(1731).getState());
	}

	@Test
	@DisplayName("Record 1732: ZIP is 23072")
	void ZIPOfRecord1732() {
		assertEquals("23072", customers.get(1731).getZIP());
	}

	@Test
	@DisplayName("Record 1732: Phone is 804-642-6963")
	void PhoneOfRecord1732() {
		assertEquals("804-642-6963", customers.get(1731).getPhone());
	}

	@Test
	@DisplayName("Record 1732: Fax is 804-642-4742")
	void FaxOfRecord1732() {
		assertEquals("804-642-4742", customers.get(1731).getFax());
	}

	@Test
	@DisplayName("Record 1732: Email is bettye@balsamo.com")
	void EmailOfRecord1732() {
		assertEquals("bettye@balsamo.com", customers.get(1731).getEmail());
	}

	@Test
	@DisplayName("Record 1732: Web is http://www.bettyebalsamo.com")
	void WebOfRecord1732() {
		assertEquals("http://www.bettyebalsamo.com", customers.get(1731).getWeb());
	}
}
