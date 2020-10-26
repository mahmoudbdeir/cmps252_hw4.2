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

@Tag("38")
class Record_1805 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1805: FirstName is Keneth")
	void FirstNameOfRecord1805() {
		assertEquals("Keneth", customers.get(1804).getFirstName());
	}

	@Test
	@DisplayName("Record 1805: LastName is Winget")
	void LastNameOfRecord1805() {
		assertEquals("Winget", customers.get(1804).getLastName());
	}

	@Test
	@DisplayName("Record 1805: Company is American Board Pediatrics Inc")
	void CompanyOfRecord1805() {
		assertEquals("American Board Pediatrics Inc", customers.get(1804).getCompany());
	}

	@Test
	@DisplayName("Record 1805: Address is 200 Williams Dr")
	void AddressOfRecord1805() {
		assertEquals("200 Williams Dr", customers.get(1804).getAddress());
	}

	@Test
	@DisplayName("Record 1805: City is Ramsey")
	void CityOfRecord1805() {
		assertEquals("Ramsey", customers.get(1804).getCity());
	}

	@Test
	@DisplayName("Record 1805: County is Bergen")
	void CountyOfRecord1805() {
		assertEquals("Bergen", customers.get(1804).getCounty());
	}

	@Test
	@DisplayName("Record 1805: State is NJ")
	void StateOfRecord1805() {
		assertEquals("NJ", customers.get(1804).getState());
	}

	@Test
	@DisplayName("Record 1805: ZIP is 7446")
	void ZIPOfRecord1805() {
		assertEquals("7446", customers.get(1804).getZIP());
	}

	@Test
	@DisplayName("Record 1805: Phone is 201-265-6784")
	void PhoneOfRecord1805() {
		assertEquals("201-265-6784", customers.get(1804).getPhone());
	}

	@Test
	@DisplayName("Record 1805: Fax is 201-265-5892")
	void FaxOfRecord1805() {
		assertEquals("201-265-5892", customers.get(1804).getFax());
	}

	@Test
	@DisplayName("Record 1805: Email is keneth@winget.com")
	void EmailOfRecord1805() {
		assertEquals("keneth@winget.com", customers.get(1804).getEmail());
	}

	@Test
	@DisplayName("Record 1805: Web is http://www.kenethwinget.com")
	void WebOfRecord1805() {
		assertEquals("http://www.kenethwinget.com", customers.get(1804).getWeb());
	}
}
