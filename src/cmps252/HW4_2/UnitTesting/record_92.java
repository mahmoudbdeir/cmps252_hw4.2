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

@Tag("23")
class Record_92 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 92: FirstName is Jacquline")
	void FirstNameOfRecord92() {
		assertEquals("Jacquline", customers.get(91).getFirstName());
	}

	@Test
	@DisplayName("Record 92: LastName is Shoat")
	void LastNameOfRecord92() {
		assertEquals("Shoat", customers.get(91).getLastName());
	}

	@Test
	@DisplayName("Record 92: Company is Dmt Corporation")
	void CompanyOfRecord92() {
		assertEquals("Dmt Corporation", customers.get(91).getCompany());
	}

	@Test
	@DisplayName("Record 92: Address is 171 Green Pond Rd")
	void AddressOfRecord92() {
		assertEquals("171 Green Pond Rd", customers.get(91).getAddress());
	}

	@Test
	@DisplayName("Record 92: City is Rockaway")
	void CityOfRecord92() {
		assertEquals("Rockaway", customers.get(91).getCity());
	}

	@Test
	@DisplayName("Record 92: County is Morris")
	void CountyOfRecord92() {
		assertEquals("Morris", customers.get(91).getCounty());
	}

	@Test
	@DisplayName("Record 92: State is NJ")
	void StateOfRecord92() {
		assertEquals("NJ", customers.get(91).getState());
	}

	@Test
	@DisplayName("Record 92: ZIP is 7866")
	void ZIPOfRecord92() {
		assertEquals("7866", customers.get(91).getZIP());
	}

	@Test
	@DisplayName("Record 92: Phone is 973-627-7913")
	void PhoneOfRecord92() {
		assertEquals("973-627-7913", customers.get(91).getPhone());
	}

	@Test
	@DisplayName("Record 92: Fax is 973-627-3253")
	void FaxOfRecord92() {
		assertEquals("973-627-3253", customers.get(91).getFax());
	}

	@Test
	@DisplayName("Record 92: Email is jacquline@shoat.com")
	void EmailOfRecord92() {
		assertEquals("jacquline@shoat.com", customers.get(91).getEmail());
	}

	@Test
	@DisplayName("Record 92: Web is http://www.jacqulineshoat.com")
	void WebOfRecord92() {
		assertEquals("http://www.jacqulineshoat.com", customers.get(91).getWeb());
	}
}
