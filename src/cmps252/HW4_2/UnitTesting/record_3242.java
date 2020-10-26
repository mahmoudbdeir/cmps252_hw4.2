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

@Tag("18")
class Record_3242 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3242: FirstName is Kirsten")
	void FirstNameOfRecord3242() {
		assertEquals("Kirsten", customers.get(3241).getFirstName());
	}

	@Test
	@DisplayName("Record 3242: LastName is Mynke")
	void LastNameOfRecord3242() {
		assertEquals("Mynke", customers.get(3241).getLastName());
	}

	@Test
	@DisplayName("Record 3242: Company is Miller, Mccook Jr")
	void CompanyOfRecord3242() {
		assertEquals("Miller, Mccook Jr", customers.get(3241).getCompany());
	}

	@Test
	@DisplayName("Record 3242: Address is 18634 Pioneer Blvd")
	void AddressOfRecord3242() {
		assertEquals("18634 Pioneer Blvd", customers.get(3241).getAddress());
	}

	@Test
	@DisplayName("Record 3242: City is Artesia")
	void CityOfRecord3242() {
		assertEquals("Artesia", customers.get(3241).getCity());
	}

	@Test
	@DisplayName("Record 3242: County is Los Angeles")
	void CountyOfRecord3242() {
		assertEquals("Los Angeles", customers.get(3241).getCounty());
	}

	@Test
	@DisplayName("Record 3242: State is CA")
	void StateOfRecord3242() {
		assertEquals("CA", customers.get(3241).getState());
	}

	@Test
	@DisplayName("Record 3242: ZIP is 90701")
	void ZIPOfRecord3242() {
		assertEquals("90701", customers.get(3241).getZIP());
	}

	@Test
	@DisplayName("Record 3242: Phone is 562-809-8135")
	void PhoneOfRecord3242() {
		assertEquals("562-809-8135", customers.get(3241).getPhone());
	}

	@Test
	@DisplayName("Record 3242: Fax is 562-809-9645")
	void FaxOfRecord3242() {
		assertEquals("562-809-9645", customers.get(3241).getFax());
	}

	@Test
	@DisplayName("Record 3242: Email is kirsten@mynke.com")
	void EmailOfRecord3242() {
		assertEquals("kirsten@mynke.com", customers.get(3241).getEmail());
	}

	@Test
	@DisplayName("Record 3242: Web is http://www.kirstenmynke.com")
	void WebOfRecord3242() {
		assertEquals("http://www.kirstenmynke.com", customers.get(3241).getWeb());
	}
}
