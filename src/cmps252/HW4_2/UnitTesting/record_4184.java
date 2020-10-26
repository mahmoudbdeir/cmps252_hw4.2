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

@Tag("10")
class Record_4184 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4184: FirstName is Seymour")
	void FirstNameOfRecord4184() {
		assertEquals("Seymour", customers.get(4183).getFirstName());
	}

	@Test
	@DisplayName("Record 4184: LastName is Lolli")
	void LastNameOfRecord4184() {
		assertEquals("Lolli", customers.get(4183).getLastName());
	}

	@Test
	@DisplayName("Record 4184: Company is Deans Quality Auto & Truck Rpr")
	void CompanyOfRecord4184() {
		assertEquals("Deans Quality Auto & Truck Rpr", customers.get(4183).getCompany());
	}

	@Test
	@DisplayName("Record 4184: Address is 107 W Austin St")
	void AddressOfRecord4184() {
		assertEquals("107 W Austin St", customers.get(4183).getAddress());
	}

	@Test
	@DisplayName("Record 4184: City is Marshall")
	void CityOfRecord4184() {
		assertEquals("Marshall", customers.get(4183).getCity());
	}

	@Test
	@DisplayName("Record 4184: County is Harrison")
	void CountyOfRecord4184() {
		assertEquals("Harrison", customers.get(4183).getCounty());
	}

	@Test
	@DisplayName("Record 4184: State is TX")
	void StateOfRecord4184() {
		assertEquals("TX", customers.get(4183).getState());
	}

	@Test
	@DisplayName("Record 4184: ZIP is 75670")
	void ZIPOfRecord4184() {
		assertEquals("75670", customers.get(4183).getZIP());
	}

	@Test
	@DisplayName("Record 4184: Phone is 903-938-0660")
	void PhoneOfRecord4184() {
		assertEquals("903-938-0660", customers.get(4183).getPhone());
	}

	@Test
	@DisplayName("Record 4184: Fax is 903-938-9908")
	void FaxOfRecord4184() {
		assertEquals("903-938-9908", customers.get(4183).getFax());
	}

	@Test
	@DisplayName("Record 4184: Email is seymour@lolli.com")
	void EmailOfRecord4184() {
		assertEquals("seymour@lolli.com", customers.get(4183).getEmail());
	}

	@Test
	@DisplayName("Record 4184: Web is http://www.seymourlolli.com")
	void WebOfRecord4184() {
		assertEquals("http://www.seymourlolli.com", customers.get(4183).getWeb());
	}
}
