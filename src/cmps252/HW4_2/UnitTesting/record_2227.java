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
class Record_2227 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2227: FirstName is Ma")
	void FirstNameOfRecord2227() {
		assertEquals("Ma", customers.get(2226).getFirstName());
	}

	@Test
	@DisplayName("Record 2227: LastName is Tanguma")
	void LastNameOfRecord2227() {
		assertEquals("Tanguma", customers.get(2226).getLastName());
	}

	@Test
	@DisplayName("Record 2227: Company is Cmnty Actn Cmmte Lehigh Vly")
	void CompanyOfRecord2227() {
		assertEquals("Cmnty Actn Cmmte Lehigh Vly", customers.get(2226).getCompany());
	}

	@Test
	@DisplayName("Record 2227: Address is 375 Rabro Dr")
	void AddressOfRecord2227() {
		assertEquals("375 Rabro Dr", customers.get(2226).getAddress());
	}

	@Test
	@DisplayName("Record 2227: City is Hauppauge")
	void CityOfRecord2227() {
		assertEquals("Hauppauge", customers.get(2226).getCity());
	}

	@Test
	@DisplayName("Record 2227: County is Suffolk")
	void CountyOfRecord2227() {
		assertEquals("Suffolk", customers.get(2226).getCounty());
	}

	@Test
	@DisplayName("Record 2227: State is NY")
	void StateOfRecord2227() {
		assertEquals("NY", customers.get(2226).getState());
	}

	@Test
	@DisplayName("Record 2227: ZIP is 11788")
	void ZIPOfRecord2227() {
		assertEquals("11788", customers.get(2226).getZIP());
	}

	@Test
	@DisplayName("Record 2227: Phone is 631-582-0446")
	void PhoneOfRecord2227() {
		assertEquals("631-582-0446", customers.get(2226).getPhone());
	}

	@Test
	@DisplayName("Record 2227: Fax is 631-582-5678")
	void FaxOfRecord2227() {
		assertEquals("631-582-5678", customers.get(2226).getFax());
	}

	@Test
	@DisplayName("Record 2227: Email is ma@tanguma.com")
	void EmailOfRecord2227() {
		assertEquals("ma@tanguma.com", customers.get(2226).getEmail());
	}

	@Test
	@DisplayName("Record 2227: Web is http://www.matanguma.com")
	void WebOfRecord2227() {
		assertEquals("http://www.matanguma.com", customers.get(2226).getWeb());
	}
}
