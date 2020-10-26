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

@Tag("11")
class Record_4068 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4068: FirstName is Antonia")
	void FirstNameOfRecord4068() {
		assertEquals("Antonia", customers.get(4067).getFirstName());
	}

	@Test
	@DisplayName("Record 4068: LastName is Shkreli")
	void LastNameOfRecord4068() {
		assertEquals("Shkreli", customers.get(4067).getLastName());
	}

	@Test
	@DisplayName("Record 4068: Company is Fremont Quality Inn")
	void CompanyOfRecord4068() {
		assertEquals("Fremont Quality Inn", customers.get(4067).getCompany());
	}

	@Test
	@DisplayName("Record 4068: Address is 720 S Van Buren St")
	void AddressOfRecord4068() {
		assertEquals("720 S Van Buren St", customers.get(4067).getAddress());
	}

	@Test
	@DisplayName("Record 4068: City is Green Bay")
	void CityOfRecord4068() {
		assertEquals("Green Bay", customers.get(4067).getCity());
	}

	@Test
	@DisplayName("Record 4068: County is Brown")
	void CountyOfRecord4068() {
		assertEquals("Brown", customers.get(4067).getCounty());
	}

	@Test
	@DisplayName("Record 4068: State is WI")
	void StateOfRecord4068() {
		assertEquals("WI", customers.get(4067).getState());
	}

	@Test
	@DisplayName("Record 4068: ZIP is 54301")
	void ZIPOfRecord4068() {
		assertEquals("54301", customers.get(4067).getZIP());
	}

	@Test
	@DisplayName("Record 4068: Phone is 920-433-1569")
	void PhoneOfRecord4068() {
		assertEquals("920-433-1569", customers.get(4067).getPhone());
	}

	@Test
	@DisplayName("Record 4068: Fax is 920-433-8967")
	void FaxOfRecord4068() {
		assertEquals("920-433-8967", customers.get(4067).getFax());
	}

	@Test
	@DisplayName("Record 4068: Email is antonia@shkreli.com")
	void EmailOfRecord4068() {
		assertEquals("antonia@shkreli.com", customers.get(4067).getEmail());
	}

	@Test
	@DisplayName("Record 4068: Web is http://www.antoniashkreli.com")
	void WebOfRecord4068() {
		assertEquals("http://www.antoniashkreli.com", customers.get(4067).getWeb());
	}
}
