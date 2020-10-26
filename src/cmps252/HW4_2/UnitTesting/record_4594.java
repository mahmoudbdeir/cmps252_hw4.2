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

@Tag("7")
class Record_4594 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4594: FirstName is Clark")
	void FirstNameOfRecord4594() {
		assertEquals("Clark", customers.get(4593).getFirstName());
	}

	@Test
	@DisplayName("Record 4594: LastName is Ausley")
	void LastNameOfRecord4594() {
		assertEquals("Ausley", customers.get(4593).getLastName());
	}

	@Test
	@DisplayName("Record 4594: Company is Kemper Cpa Group")
	void CompanyOfRecord4594() {
		assertEquals("Kemper Cpa Group", customers.get(4593).getCompany());
	}

	@Test
	@DisplayName("Record 4594: Address is 6255 W Sunset Blvd")
	void AddressOfRecord4594() {
		assertEquals("6255 W Sunset Blvd", customers.get(4593).getAddress());
	}

	@Test
	@DisplayName("Record 4594: City is Los Angeles")
	void CityOfRecord4594() {
		assertEquals("Los Angeles", customers.get(4593).getCity());
	}

	@Test
	@DisplayName("Record 4594: County is Los Angeles")
	void CountyOfRecord4594() {
		assertEquals("Los Angeles", customers.get(4593).getCounty());
	}

	@Test
	@DisplayName("Record 4594: State is CA")
	void StateOfRecord4594() {
		assertEquals("CA", customers.get(4593).getState());
	}

	@Test
	@DisplayName("Record 4594: ZIP is 90028")
	void ZIPOfRecord4594() {
		assertEquals("90028", customers.get(4593).getZIP());
	}

	@Test
	@DisplayName("Record 4594: Phone is 323-462-1175")
	void PhoneOfRecord4594() {
		assertEquals("323-462-1175", customers.get(4593).getPhone());
	}

	@Test
	@DisplayName("Record 4594: Fax is 323-462-3525")
	void FaxOfRecord4594() {
		assertEquals("323-462-3525", customers.get(4593).getFax());
	}

	@Test
	@DisplayName("Record 4594: Email is clark@ausley.com")
	void EmailOfRecord4594() {
		assertEquals("clark@ausley.com", customers.get(4593).getEmail());
	}

	@Test
	@DisplayName("Record 4594: Web is http://www.clarkausley.com")
	void WebOfRecord4594() {
		assertEquals("http://www.clarkausley.com", customers.get(4593).getWeb());
	}
}
