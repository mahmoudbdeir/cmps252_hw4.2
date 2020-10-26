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
class Record_2499 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2499: FirstName is Dawn")
	void FirstNameOfRecord2499() {
		assertEquals("Dawn", customers.get(2498).getFirstName());
	}

	@Test
	@DisplayName("Record 2499: LastName is Ripp")
	void LastNameOfRecord2499() {
		assertEquals("Ripp", customers.get(2498).getLastName());
	}

	@Test
	@DisplayName("Record 2499: Company is Johnson And Anderson Inc")
	void CompanyOfRecord2499() {
		assertEquals("Johnson And Anderson Inc", customers.get(2498).getCompany());
	}

	@Test
	@DisplayName("Record 2499: Address is 1567 S University Blvd")
	void AddressOfRecord2499() {
		assertEquals("1567 S University Blvd", customers.get(2498).getAddress());
	}

	@Test
	@DisplayName("Record 2499: City is Denver")
	void CityOfRecord2499() {
		assertEquals("Denver", customers.get(2498).getCity());
	}

	@Test
	@DisplayName("Record 2499: County is Denver")
	void CountyOfRecord2499() {
		assertEquals("Denver", customers.get(2498).getCounty());
	}

	@Test
	@DisplayName("Record 2499: State is CO")
	void StateOfRecord2499() {
		assertEquals("CO", customers.get(2498).getState());
	}

	@Test
	@DisplayName("Record 2499: ZIP is 80210")
	void ZIPOfRecord2499() {
		assertEquals("80210", customers.get(2498).getZIP());
	}

	@Test
	@DisplayName("Record 2499: Phone is 303-733-0668")
	void PhoneOfRecord2499() {
		assertEquals("303-733-0668", customers.get(2498).getPhone());
	}

	@Test
	@DisplayName("Record 2499: Fax is 303-733-4237")
	void FaxOfRecord2499() {
		assertEquals("303-733-4237", customers.get(2498).getFax());
	}

	@Test
	@DisplayName("Record 2499: Email is dawn@ripp.com")
	void EmailOfRecord2499() {
		assertEquals("dawn@ripp.com", customers.get(2498).getEmail());
	}

	@Test
	@DisplayName("Record 2499: Web is http://www.dawnripp.com")
	void WebOfRecord2499() {
		assertEquals("http://www.dawnripp.com", customers.get(2498).getWeb());
	}
}
