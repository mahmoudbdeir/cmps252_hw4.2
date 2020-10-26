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
class Record_3054 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3054: FirstName is Sam")
	void FirstNameOfRecord3054() {
		assertEquals("Sam", customers.get(3053).getFirstName());
	}

	@Test
	@DisplayName("Record 3054: LastName is Betance")
	void LastNameOfRecord3054() {
		assertEquals("Betance", customers.get(3053).getLastName());
	}

	@Test
	@DisplayName("Record 3054: Company is Svennungsen, Mark Od")
	void CompanyOfRecord3054() {
		assertEquals("Svennungsen, Mark Od", customers.get(3053).getCompany());
	}

	@Test
	@DisplayName("Record 3054: Address is 1501 Edgemore Ave")
	void AddressOfRecord3054() {
		assertEquals("1501 Edgemore Ave", customers.get(3053).getAddress());
	}

	@Test
	@DisplayName("Record 3054: City is Salisbury")
	void CityOfRecord3054() {
		assertEquals("Salisbury", customers.get(3053).getCity());
	}

	@Test
	@DisplayName("Record 3054: County is Wicomico")
	void CountyOfRecord3054() {
		assertEquals("Wicomico", customers.get(3053).getCounty());
	}

	@Test
	@DisplayName("Record 3054: State is MD")
	void StateOfRecord3054() {
		assertEquals("MD", customers.get(3053).getState());
	}

	@Test
	@DisplayName("Record 3054: ZIP is 21801")
	void ZIPOfRecord3054() {
		assertEquals("21801", customers.get(3053).getZIP());
	}

	@Test
	@DisplayName("Record 3054: Phone is 410-548-5660")
	void PhoneOfRecord3054() {
		assertEquals("410-548-5660", customers.get(3053).getPhone());
	}

	@Test
	@DisplayName("Record 3054: Fax is 410-548-3255")
	void FaxOfRecord3054() {
		assertEquals("410-548-3255", customers.get(3053).getFax());
	}

	@Test
	@DisplayName("Record 3054: Email is sam@betance.com")
	void EmailOfRecord3054() {
		assertEquals("sam@betance.com", customers.get(3053).getEmail());
	}

	@Test
	@DisplayName("Record 3054: Web is http://www.sambetance.com")
	void WebOfRecord3054() {
		assertEquals("http://www.sambetance.com", customers.get(3053).getWeb());
	}
}
