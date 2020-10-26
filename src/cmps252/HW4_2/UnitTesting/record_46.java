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

@Tag("5")
class Record_46 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 46: FirstName is Van")
	void FirstNameOfRecord46() {
		assertEquals("Van", customers.get(45).getFirstName());
	}

	@Test
	@DisplayName("Record 46: LastName is Sprewell")
	void LastNameOfRecord46() {
		assertEquals("Sprewell", customers.get(45).getLastName());
	}

	@Test
	@DisplayName("Record 46: Company is Asia Pacific Technotrade")
	void CompanyOfRecord46() {
		assertEquals("Asia Pacific Technotrade", customers.get(45).getCompany());
	}

	@Test
	@DisplayName("Record 46: Address is 1214 Mcrae Blvd")
	void AddressOfRecord46() {
		assertEquals("1214 Mcrae Blvd", customers.get(45).getAddress());
	}

	@Test
	@DisplayName("Record 46: City is El Paso")
	void CityOfRecord46() {
		assertEquals("El Paso", customers.get(45).getCity());
	}

	@Test
	@DisplayName("Record 46: County is El Paso")
	void CountyOfRecord46() {
		assertEquals("El Paso", customers.get(45).getCounty());
	}

	@Test
	@DisplayName("Record 46: State is TX")
	void StateOfRecord46() {
		assertEquals("TX", customers.get(45).getState());
	}

	@Test
	@DisplayName("Record 46: ZIP is 79925")
	void ZIPOfRecord46() {
		assertEquals("79925", customers.get(45).getZIP());
	}

	@Test
	@DisplayName("Record 46: Phone is 915-593-7646")
	void PhoneOfRecord46() {
		assertEquals("915-593-7646", customers.get(45).getPhone());
	}

	@Test
	@DisplayName("Record 46: Fax is 915-593-9456")
	void FaxOfRecord46() {
		assertEquals("915-593-9456", customers.get(45).getFax());
	}

	@Test
	@DisplayName("Record 46: Email is van@sprewell.com")
	void EmailOfRecord46() {
		assertEquals("van@sprewell.com", customers.get(45).getEmail());
	}

	@Test
	@DisplayName("Record 46: Web is http://www.vansprewell.com")
	void WebOfRecord46() {
		assertEquals("http://www.vansprewell.com", customers.get(45).getWeb());
	}
}
