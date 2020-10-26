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

@Tag("22")
class Record_2741 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2741: FirstName is Sherwood")
	void FirstNameOfRecord2741() {
		assertEquals("Sherwood", customers.get(2740).getFirstName());
	}

	@Test
	@DisplayName("Record 2741: LastName is Saether")
	void LastNameOfRecord2741() {
		assertEquals("Saether", customers.get(2740).getLastName());
	}

	@Test
	@DisplayName("Record 2741: Company is Rockford Insulation Inc")
	void CompanyOfRecord2741() {
		assertEquals("Rockford Insulation Inc", customers.get(2740).getCompany());
	}

	@Test
	@DisplayName("Record 2741: Address is 509 Broad Ave")
	void AddressOfRecord2741() {
		assertEquals("509 Broad Ave", customers.get(2740).getAddress());
	}

	@Test
	@DisplayName("Record 2741: City is Ridgefield")
	void CityOfRecord2741() {
		assertEquals("Ridgefield", customers.get(2740).getCity());
	}

	@Test
	@DisplayName("Record 2741: County is Bergen")
	void CountyOfRecord2741() {
		assertEquals("Bergen", customers.get(2740).getCounty());
	}

	@Test
	@DisplayName("Record 2741: State is NJ")
	void StateOfRecord2741() {
		assertEquals("NJ", customers.get(2740).getState());
	}

	@Test
	@DisplayName("Record 2741: ZIP is 7657")
	void ZIPOfRecord2741() {
		assertEquals("7657", customers.get(2740).getZIP());
	}

	@Test
	@DisplayName("Record 2741: Phone is 201-945-2570")
	void PhoneOfRecord2741() {
		assertEquals("201-945-2570", customers.get(2740).getPhone());
	}

	@Test
	@DisplayName("Record 2741: Fax is 201-945-9396")
	void FaxOfRecord2741() {
		assertEquals("201-945-9396", customers.get(2740).getFax());
	}

	@Test
	@DisplayName("Record 2741: Email is sherwood@saether.com")
	void EmailOfRecord2741() {
		assertEquals("sherwood@saether.com", customers.get(2740).getEmail());
	}

	@Test
	@DisplayName("Record 2741: Web is http://www.sherwoodsaether.com")
	void WebOfRecord2741() {
		assertEquals("http://www.sherwoodsaether.com", customers.get(2740).getWeb());
	}
}
