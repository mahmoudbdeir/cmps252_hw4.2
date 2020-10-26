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
class Record_3032 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3032: FirstName is Burl")
	void FirstNameOfRecord3032() {
		assertEquals("Burl", customers.get(3031).getFirstName());
	}

	@Test
	@DisplayName("Record 3032: LastName is Hobart")
	void LastNameOfRecord3032() {
		assertEquals("Hobart", customers.get(3031).getLastName());
	}

	@Test
	@DisplayName("Record 3032: Company is Featherly, Henry F Esq")
	void CompanyOfRecord3032() {
		assertEquals("Featherly, Henry F Esq", customers.get(3031).getCompany());
	}

	@Test
	@DisplayName("Record 3032: Address is 226 Bridge St")
	void AddressOfRecord3032() {
		assertEquals("226 Bridge St", customers.get(3031).getAddress());
	}

	@Test
	@DisplayName("Record 3032: City is Yuba City")
	void CityOfRecord3032() {
		assertEquals("Yuba City", customers.get(3031).getCity());
	}

	@Test
	@DisplayName("Record 3032: County is Sutter")
	void CountyOfRecord3032() {
		assertEquals("Sutter", customers.get(3031).getCounty());
	}

	@Test
	@DisplayName("Record 3032: State is CA")
	void StateOfRecord3032() {
		assertEquals("CA", customers.get(3031).getState());
	}

	@Test
	@DisplayName("Record 3032: ZIP is 95991")
	void ZIPOfRecord3032() {
		assertEquals("95991", customers.get(3031).getZIP());
	}

	@Test
	@DisplayName("Record 3032: Phone is 530-674-6724")
	void PhoneOfRecord3032() {
		assertEquals("530-674-6724", customers.get(3031).getPhone());
	}

	@Test
	@DisplayName("Record 3032: Fax is 530-674-8936")
	void FaxOfRecord3032() {
		assertEquals("530-674-8936", customers.get(3031).getFax());
	}

	@Test
	@DisplayName("Record 3032: Email is burl@hobart.com")
	void EmailOfRecord3032() {
		assertEquals("burl@hobart.com", customers.get(3031).getEmail());
	}

	@Test
	@DisplayName("Record 3032: Web is http://www.burlhobart.com")
	void WebOfRecord3032() {
		assertEquals("http://www.burlhobart.com", customers.get(3031).getWeb());
	}
}
