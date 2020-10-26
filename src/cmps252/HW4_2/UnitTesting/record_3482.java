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

@Tag("10")
class Record_3482 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3482: FirstName is Elisha")
	void FirstNameOfRecord3482() {
		assertEquals("Elisha", customers.get(3481).getFirstName());
	}

	@Test
	@DisplayName("Record 3482: LastName is Below")
	void LastNameOfRecord3482() {
		assertEquals("Below", customers.get(3481).getLastName());
	}

	@Test
	@DisplayName("Record 3482: Company is Rhode Island Public Buildings")
	void CompanyOfRecord3482() {
		assertEquals("Rhode Island Public Buildings", customers.get(3481).getCompany());
	}

	@Test
	@DisplayName("Record 3482: Address is 6240 Prescott Ct")
	void AddressOfRecord3482() {
		assertEquals("6240 Prescott Ct", customers.get(3481).getAddress());
	}

	@Test
	@DisplayName("Record 3482: City is Chino")
	void CityOfRecord3482() {
		assertEquals("Chino", customers.get(3481).getCity());
	}

	@Test
	@DisplayName("Record 3482: County is San Bernardino")
	void CountyOfRecord3482() {
		assertEquals("San Bernardino", customers.get(3481).getCounty());
	}

	@Test
	@DisplayName("Record 3482: State is CA")
	void StateOfRecord3482() {
		assertEquals("CA", customers.get(3481).getState());
	}

	@Test
	@DisplayName("Record 3482: ZIP is 91710")
	void ZIPOfRecord3482() {
		assertEquals("91710", customers.get(3481).getZIP());
	}

	@Test
	@DisplayName("Record 3482: Phone is 909-465-1559")
	void PhoneOfRecord3482() {
		assertEquals("909-465-1559", customers.get(3481).getPhone());
	}

	@Test
	@DisplayName("Record 3482: Fax is 909-465-7374")
	void FaxOfRecord3482() {
		assertEquals("909-465-7374", customers.get(3481).getFax());
	}

	@Test
	@DisplayName("Record 3482: Email is elisha@below.com")
	void EmailOfRecord3482() {
		assertEquals("elisha@below.com", customers.get(3481).getEmail());
	}

	@Test
	@DisplayName("Record 3482: Web is http://www.elishabelow.com")
	void WebOfRecord3482() {
		assertEquals("http://www.elishabelow.com", customers.get(3481).getWeb());
	}
}
