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
class Record_3068 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3068: FirstName is Sheree")
	void FirstNameOfRecord3068() {
		assertEquals("Sheree", customers.get(3067).getFirstName());
	}

	@Test
	@DisplayName("Record 3068: LastName is Stich")
	void LastNameOfRecord3068() {
		assertEquals("Stich", customers.get(3067).getLastName());
	}

	@Test
	@DisplayName("Record 3068: Company is Micro Shop")
	void CompanyOfRecord3068() {
		assertEquals("Micro Shop", customers.get(3067).getCompany());
	}

	@Test
	@DisplayName("Record 3068: Address is 6935 Vickie Cir")
	void AddressOfRecord3068() {
		assertEquals("6935 Vickie Cir", customers.get(3067).getAddress());
	}

	@Test
	@DisplayName("Record 3068: City is Melbourne")
	void CityOfRecord3068() {
		assertEquals("Melbourne", customers.get(3067).getCity());
	}

	@Test
	@DisplayName("Record 3068: County is Brevard")
	void CountyOfRecord3068() {
		assertEquals("Brevard", customers.get(3067).getCounty());
	}

	@Test
	@DisplayName("Record 3068: State is FL")
	void StateOfRecord3068() {
		assertEquals("FL", customers.get(3067).getState());
	}

	@Test
	@DisplayName("Record 3068: ZIP is 32904")
	void ZIPOfRecord3068() {
		assertEquals("32904", customers.get(3067).getZIP());
	}

	@Test
	@DisplayName("Record 3068: Phone is 321-951-4388")
	void PhoneOfRecord3068() {
		assertEquals("321-951-4388", customers.get(3067).getPhone());
	}

	@Test
	@DisplayName("Record 3068: Fax is 321-951-4162")
	void FaxOfRecord3068() {
		assertEquals("321-951-4162", customers.get(3067).getFax());
	}

	@Test
	@DisplayName("Record 3068: Email is sheree@stich.com")
	void EmailOfRecord3068() {
		assertEquals("sheree@stich.com", customers.get(3067).getEmail());
	}

	@Test
	@DisplayName("Record 3068: Web is http://www.shereestich.com")
	void WebOfRecord3068() {
		assertEquals("http://www.shereestich.com", customers.get(3067).getWeb());
	}
}
