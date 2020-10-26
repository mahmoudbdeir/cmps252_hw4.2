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

@Tag("41")
class Record_2918 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2918: FirstName is Kira")
	void FirstNameOfRecord2918() {
		assertEquals("Kira", customers.get(2917).getFirstName());
	}

	@Test
	@DisplayName("Record 2918: LastName is Hara")
	void LastNameOfRecord2918() {
		assertEquals("Hara", customers.get(2917).getLastName());
	}

	@Test
	@DisplayName("Record 2918: Company is Paris Auto Repair")
	void CompanyOfRecord2918() {
		assertEquals("Paris Auto Repair", customers.get(2917).getCompany());
	}

	@Test
	@DisplayName("Record 2918: Address is Box #-867")
	void AddressOfRecord2918() {
		assertEquals("Box #-867", customers.get(2917).getAddress());
	}

	@Test
	@DisplayName("Record 2918: City is Livermore")
	void CityOfRecord2918() {
		assertEquals("Livermore", customers.get(2917).getCity());
	}

	@Test
	@DisplayName("Record 2918: County is Alameda")
	void CountyOfRecord2918() {
		assertEquals("Alameda", customers.get(2917).getCounty());
	}

	@Test
	@DisplayName("Record 2918: State is CA")
	void StateOfRecord2918() {
		assertEquals("CA", customers.get(2917).getState());
	}

	@Test
	@DisplayName("Record 2918: ZIP is 94551")
	void ZIPOfRecord2918() {
		assertEquals("94551", customers.get(2917).getZIP());
	}

	@Test
	@DisplayName("Record 2918: Phone is 925-449-1481")
	void PhoneOfRecord2918() {
		assertEquals("925-449-1481", customers.get(2917).getPhone());
	}

	@Test
	@DisplayName("Record 2918: Fax is 925-449-2672")
	void FaxOfRecord2918() {
		assertEquals("925-449-2672", customers.get(2917).getFax());
	}

	@Test
	@DisplayName("Record 2918: Email is kira@hara.com")
	void EmailOfRecord2918() {
		assertEquals("kira@hara.com", customers.get(2917).getEmail());
	}

	@Test
	@DisplayName("Record 2918: Web is http://www.kirahara.com")
	void WebOfRecord2918() {
		assertEquals("http://www.kirahara.com", customers.get(2917).getWeb());
	}
}
