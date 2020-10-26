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

@Tag("47")
class Record_3129 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3129: FirstName is Kathi")
	void FirstNameOfRecord3129() {
		assertEquals("Kathi", customers.get(3128).getFirstName());
	}

	@Test
	@DisplayName("Record 3129: LastName is Woytek")
	void LastNameOfRecord3129() {
		assertEquals("Woytek", customers.get(3128).getLastName());
	}

	@Test
	@DisplayName("Record 3129: Company is Honohan, Kathleen R Esq")
	void CompanyOfRecord3129() {
		assertEquals("Honohan, Kathleen R Esq", customers.get(3128).getCompany());
	}

	@Test
	@DisplayName("Record 3129: Address is 500 Mill Rd")
	void AddressOfRecord3129() {
		assertEquals("500 Mill Rd", customers.get(3128).getAddress());
	}

	@Test
	@DisplayName("Record 3129: City is Bensalem")
	void CityOfRecord3129() {
		assertEquals("Bensalem", customers.get(3128).getCity());
	}

	@Test
	@DisplayName("Record 3129: County is Bucks")
	void CountyOfRecord3129() {
		assertEquals("Bucks", customers.get(3128).getCounty());
	}

	@Test
	@DisplayName("Record 3129: State is PA")
	void StateOfRecord3129() {
		assertEquals("PA", customers.get(3128).getState());
	}

	@Test
	@DisplayName("Record 3129: ZIP is 19020")
	void ZIPOfRecord3129() {
		assertEquals("19020", customers.get(3128).getZIP());
	}

	@Test
	@DisplayName("Record 3129: Phone is 215-638-7641")
	void PhoneOfRecord3129() {
		assertEquals("215-638-7641", customers.get(3128).getPhone());
	}

	@Test
	@DisplayName("Record 3129: Fax is 215-638-9299")
	void FaxOfRecord3129() {
		assertEquals("215-638-9299", customers.get(3128).getFax());
	}

	@Test
	@DisplayName("Record 3129: Email is kathi@woytek.com")
	void EmailOfRecord3129() {
		assertEquals("kathi@woytek.com", customers.get(3128).getEmail());
	}

	@Test
	@DisplayName("Record 3129: Web is http://www.kathiwoytek.com")
	void WebOfRecord3129() {
		assertEquals("http://www.kathiwoytek.com", customers.get(3128).getWeb());
	}
}
