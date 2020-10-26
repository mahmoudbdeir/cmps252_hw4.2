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

@Tag("27")
class Record_4645 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4645: FirstName is Bonnie")
	void FirstNameOfRecord4645() {
		assertEquals("Bonnie", customers.get(4644).getFirstName());
	}

	@Test
	@DisplayName("Record 4645: LastName is Mackins")
	void LastNameOfRecord4645() {
		assertEquals("Mackins", customers.get(4644).getLastName());
	}

	@Test
	@DisplayName("Record 4645: Company is General Packaging Service Inc")
	void CompanyOfRecord4645() {
		assertEquals("General Packaging Service Inc", customers.get(4644).getCompany());
	}

	@Test
	@DisplayName("Record 4645: Address is 1356 Surrey St")
	void AddressOfRecord4645() {
		assertEquals("1356 Surrey St", customers.get(4644).getAddress());
	}

	@Test
	@DisplayName("Record 4645: City is Lafayette")
	void CityOfRecord4645() {
		assertEquals("Lafayette", customers.get(4644).getCity());
	}

	@Test
	@DisplayName("Record 4645: County is Lafayette")
	void CountyOfRecord4645() {
		assertEquals("Lafayette", customers.get(4644).getCounty());
	}

	@Test
	@DisplayName("Record 4645: State is LA")
	void StateOfRecord4645() {
		assertEquals("LA", customers.get(4644).getState());
	}

	@Test
	@DisplayName("Record 4645: ZIP is 70501")
	void ZIPOfRecord4645() {
		assertEquals("70501", customers.get(4644).getZIP());
	}

	@Test
	@DisplayName("Record 4645: Phone is 337-232-0138")
	void PhoneOfRecord4645() {
		assertEquals("337-232-0138", customers.get(4644).getPhone());
	}

	@Test
	@DisplayName("Record 4645: Fax is 337-232-7746")
	void FaxOfRecord4645() {
		assertEquals("337-232-7746", customers.get(4644).getFax());
	}

	@Test
	@DisplayName("Record 4645: Email is bonnie@mackins.com")
	void EmailOfRecord4645() {
		assertEquals("bonnie@mackins.com", customers.get(4644).getEmail());
	}

	@Test
	@DisplayName("Record 4645: Web is http://www.bonniemackins.com")
	void WebOfRecord4645() {
		assertEquals("http://www.bonniemackins.com", customers.get(4644).getWeb());
	}
}
