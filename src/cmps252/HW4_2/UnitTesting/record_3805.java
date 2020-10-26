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

@Tag("33")
class Record_3805 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3805: FirstName is Juanita")
	void FirstNameOfRecord3805() {
		assertEquals("Juanita", customers.get(3804).getFirstName());
	}

	@Test
	@DisplayName("Record 3805: LastName is Tichi")
	void LastNameOfRecord3805() {
		assertEquals("Tichi", customers.get(3804).getLastName());
	}

	@Test
	@DisplayName("Record 3805: Company is Memorial Fnrl Home & Cremetory")
	void CompanyOfRecord3805() {
		assertEquals("Memorial Fnrl Home & Cremetory", customers.get(3804).getCompany());
	}

	@Test
	@DisplayName("Record 3805: Address is 2702 Victory Ave")
	void AddressOfRecord3805() {
		assertEquals("2702 Victory Ave", customers.get(3804).getAddress());
	}

	@Test
	@DisplayName("Record 3805: City is Toledo")
	void CityOfRecord3805() {
		assertEquals("Toledo", customers.get(3804).getCity());
	}

	@Test
	@DisplayName("Record 3805: County is Lucas")
	void CountyOfRecord3805() {
		assertEquals("Lucas", customers.get(3804).getCounty());
	}

	@Test
	@DisplayName("Record 3805: State is OH")
	void StateOfRecord3805() {
		assertEquals("OH", customers.get(3804).getState());
	}

	@Test
	@DisplayName("Record 3805: ZIP is 43607")
	void ZIPOfRecord3805() {
		assertEquals("43607", customers.get(3804).getZIP());
	}

	@Test
	@DisplayName("Record 3805: Phone is 419-535-7868")
	void PhoneOfRecord3805() {
		assertEquals("419-535-7868", customers.get(3804).getPhone());
	}

	@Test
	@DisplayName("Record 3805: Fax is 419-535-4905")
	void FaxOfRecord3805() {
		assertEquals("419-535-4905", customers.get(3804).getFax());
	}

	@Test
	@DisplayName("Record 3805: Email is juanita@tichi.com")
	void EmailOfRecord3805() {
		assertEquals("juanita@tichi.com", customers.get(3804).getEmail());
	}

	@Test
	@DisplayName("Record 3805: Web is http://www.juanitatichi.com")
	void WebOfRecord3805() {
		assertEquals("http://www.juanitatichi.com", customers.get(3804).getWeb());
	}
}
