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

@Tag("35")
class Record_4732 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4732: FirstName is Robin")
	void FirstNameOfRecord4732() {
		assertEquals("Robin", customers.get(4731).getFirstName());
	}

	@Test
	@DisplayName("Record 4732: LastName is Dulle")
	void LastNameOfRecord4732() {
		assertEquals("Dulle", customers.get(4731).getLastName());
	}

	@Test
	@DisplayName("Record 4732: Company is Todays Computer Business Ctr")
	void CompanyOfRecord4732() {
		assertEquals("Todays Computer Business Ctr", customers.get(4731).getCompany());
	}

	@Test
	@DisplayName("Record 4732: Address is 3116 2nd Ave N")
	void AddressOfRecord4732() {
		assertEquals("3116 2nd Ave N", customers.get(4731).getAddress());
	}

	@Test
	@DisplayName("Record 4732: City is Billings")
	void CityOfRecord4732() {
		assertEquals("Billings", customers.get(4731).getCity());
	}

	@Test
	@DisplayName("Record 4732: County is Yellowstone")
	void CountyOfRecord4732() {
		assertEquals("Yellowstone", customers.get(4731).getCounty());
	}

	@Test
	@DisplayName("Record 4732: State is MT")
	void StateOfRecord4732() {
		assertEquals("MT", customers.get(4731).getState());
	}

	@Test
	@DisplayName("Record 4732: ZIP is 59101")
	void ZIPOfRecord4732() {
		assertEquals("59101", customers.get(4731).getZIP());
	}

	@Test
	@DisplayName("Record 4732: Phone is 406-245-9475")
	void PhoneOfRecord4732() {
		assertEquals("406-245-9475", customers.get(4731).getPhone());
	}

	@Test
	@DisplayName("Record 4732: Fax is 406-245-1586")
	void FaxOfRecord4732() {
		assertEquals("406-245-1586", customers.get(4731).getFax());
	}

	@Test
	@DisplayName("Record 4732: Email is robin@dulle.com")
	void EmailOfRecord4732() {
		assertEquals("robin@dulle.com", customers.get(4731).getEmail());
	}

	@Test
	@DisplayName("Record 4732: Web is http://www.robindulle.com")
	void WebOfRecord4732() {
		assertEquals("http://www.robindulle.com", customers.get(4731).getWeb());
	}
}
