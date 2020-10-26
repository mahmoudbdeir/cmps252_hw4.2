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

@Tag("14")
class Record_2675 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2675: FirstName is Jewel")
	void FirstNameOfRecord2675() {
		assertEquals("Jewel", customers.get(2674).getFirstName());
	}

	@Test
	@DisplayName("Record 2675: LastName is Eshlerman")
	void LastNameOfRecord2675() {
		assertEquals("Eshlerman", customers.get(2674).getLastName());
	}

	@Test
	@DisplayName("Record 2675: Company is Vantage Components Inc")
	void CompanyOfRecord2675() {
		assertEquals("Vantage Components Inc", customers.get(2674).getCompany());
	}

	@Test
	@DisplayName("Record 2675: Address is 2344 Flatbush Ave")
	void AddressOfRecord2675() {
		assertEquals("2344 Flatbush Ave", customers.get(2674).getAddress());
	}

	@Test
	@DisplayName("Record 2675: City is Brooklyn")
	void CityOfRecord2675() {
		assertEquals("Brooklyn", customers.get(2674).getCity());
	}

	@Test
	@DisplayName("Record 2675: County is Kings")
	void CountyOfRecord2675() {
		assertEquals("Kings", customers.get(2674).getCounty());
	}

	@Test
	@DisplayName("Record 2675: State is NY")
	void StateOfRecord2675() {
		assertEquals("NY", customers.get(2674).getState());
	}

	@Test
	@DisplayName("Record 2675: ZIP is 11234")
	void ZIPOfRecord2675() {
		assertEquals("11234", customers.get(2674).getZIP());
	}

	@Test
	@DisplayName("Record 2675: Phone is 718-252-8949")
	void PhoneOfRecord2675() {
		assertEquals("718-252-8949", customers.get(2674).getPhone());
	}

	@Test
	@DisplayName("Record 2675: Fax is 718-252-5499")
	void FaxOfRecord2675() {
		assertEquals("718-252-5499", customers.get(2674).getFax());
	}

	@Test
	@DisplayName("Record 2675: Email is jewel@eshlerman.com")
	void EmailOfRecord2675() {
		assertEquals("jewel@eshlerman.com", customers.get(2674).getEmail());
	}

	@Test
	@DisplayName("Record 2675: Web is http://www.jeweleshlerman.com")
	void WebOfRecord2675() {
		assertEquals("http://www.jeweleshlerman.com", customers.get(2674).getWeb());
	}
}
