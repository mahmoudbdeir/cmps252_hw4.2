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

@Tag("12")
class Record_1364 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1364: FirstName is Garry")
	void FirstNameOfRecord1364() {
		assertEquals("Garry", customers.get(1363).getFirstName());
	}

	@Test
	@DisplayName("Record 1364: LastName is Schwenck")
	void LastNameOfRecord1364() {
		assertEquals("Schwenck", customers.get(1363).getLastName());
	}

	@Test
	@DisplayName("Record 1364: Company is Crest Audio Inc")
	void CompanyOfRecord1364() {
		assertEquals("Crest Audio Inc", customers.get(1363).getCompany());
	}

	@Test
	@DisplayName("Record 1364: Address is 1540 Capitol Dr")
	void AddressOfRecord1364() {
		assertEquals("1540 Capitol Dr", customers.get(1363).getAddress());
	}

	@Test
	@DisplayName("Record 1364: City is Green Bay")
	void CityOfRecord1364() {
		assertEquals("Green Bay", customers.get(1363).getCity());
	}

	@Test
	@DisplayName("Record 1364: County is Brown")
	void CountyOfRecord1364() {
		assertEquals("Brown", customers.get(1363).getCounty());
	}

	@Test
	@DisplayName("Record 1364: State is WI")
	void StateOfRecord1364() {
		assertEquals("WI", customers.get(1363).getState());
	}

	@Test
	@DisplayName("Record 1364: ZIP is 54303")
	void ZIPOfRecord1364() {
		assertEquals("54303", customers.get(1363).getZIP());
	}

	@Test
	@DisplayName("Record 1364: Phone is 920-494-3955")
	void PhoneOfRecord1364() {
		assertEquals("920-494-3955", customers.get(1363).getPhone());
	}

	@Test
	@DisplayName("Record 1364: Fax is 920-494-2022")
	void FaxOfRecord1364() {
		assertEquals("920-494-2022", customers.get(1363).getFax());
	}

	@Test
	@DisplayName("Record 1364: Email is garry@schwenck.com")
	void EmailOfRecord1364() {
		assertEquals("garry@schwenck.com", customers.get(1363).getEmail());
	}

	@Test
	@DisplayName("Record 1364: Web is http://www.garryschwenck.com")
	void WebOfRecord1364() {
		assertEquals("http://www.garryschwenck.com", customers.get(1363).getWeb());
	}
}
