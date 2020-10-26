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

@Tag("43")
class Record_4508 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4508: FirstName is Omar")
	void FirstNameOfRecord4508() {
		assertEquals("Omar", customers.get(4507).getFirstName());
	}

	@Test
	@DisplayName("Record 4508: LastName is Bora")
	void LastNameOfRecord4508() {
		assertEquals("Bora", customers.get(4507).getLastName());
	}

	@Test
	@DisplayName("Record 4508: Company is Delaware Valley Hydraulics Inc")
	void CompanyOfRecord4508() {
		assertEquals("Delaware Valley Hydraulics Inc", customers.get(4507).getCompany());
	}

	@Test
	@DisplayName("Record 4508: Address is 6401 E Northern Lights Blvd")
	void AddressOfRecord4508() {
		assertEquals("6401 E Northern Lights Blvd", customers.get(4507).getAddress());
	}

	@Test
	@DisplayName("Record 4508: City is Anchorage")
	void CityOfRecord4508() {
		assertEquals("Anchorage", customers.get(4507).getCity());
	}

	@Test
	@DisplayName("Record 4508: County is Anchorage")
	void CountyOfRecord4508() {
		assertEquals("Anchorage", customers.get(4507).getCounty());
	}

	@Test
	@DisplayName("Record 4508: State is AK")
	void StateOfRecord4508() {
		assertEquals("AK", customers.get(4507).getState());
	}

	@Test
	@DisplayName("Record 4508: ZIP is 99504")
	void ZIPOfRecord4508() {
		assertEquals("99504", customers.get(4507).getZIP());
	}

	@Test
	@DisplayName("Record 4508: Phone is 907-338-8045")
	void PhoneOfRecord4508() {
		assertEquals("907-338-8045", customers.get(4507).getPhone());
	}

	@Test
	@DisplayName("Record 4508: Fax is 907-338-3198")
	void FaxOfRecord4508() {
		assertEquals("907-338-3198", customers.get(4507).getFax());
	}

	@Test
	@DisplayName("Record 4508: Email is omar@bora.com")
	void EmailOfRecord4508() {
		assertEquals("omar@bora.com", customers.get(4507).getEmail());
	}

	@Test
	@DisplayName("Record 4508: Web is http://www.omarbora.com")
	void WebOfRecord4508() {
		assertEquals("http://www.omarbora.com", customers.get(4507).getWeb());
	}
}
