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

@Tag("18")
class Record_338 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 338: FirstName is Tessa")
	void FirstNameOfRecord338() {
		assertEquals("Tessa", customers.get(337).getFirstName());
	}

	@Test
	@DisplayName("Record 338: LastName is Melian")
	void LastNameOfRecord338() {
		assertEquals("Melian", customers.get(337).getLastName());
	}

	@Test
	@DisplayName("Record 338: Company is Pee Dee Magazine")
	void CompanyOfRecord338() {
		assertEquals("Pee Dee Magazine", customers.get(337).getCompany());
	}

	@Test
	@DisplayName("Record 338: Address is 4425 Crawford Dr")
	void AddressOfRecord338() {
		assertEquals("4425 Crawford Dr", customers.get(337).getAddress());
	}

	@Test
	@DisplayName("Record 338: City is Abilene")
	void CityOfRecord338() {
		assertEquals("Abilene", customers.get(337).getCity());
	}

	@Test
	@DisplayName("Record 338: County is Taylor")
	void CountyOfRecord338() {
		assertEquals("Taylor", customers.get(337).getCounty());
	}

	@Test
	@DisplayName("Record 338: State is TX")
	void StateOfRecord338() {
		assertEquals("TX", customers.get(337).getState());
	}

	@Test
	@DisplayName("Record 338: ZIP is 79602")
	void ZIPOfRecord338() {
		assertEquals("79602", customers.get(337).getZIP());
	}

	@Test
	@DisplayName("Record 338: Phone is 325-692-3608")
	void PhoneOfRecord338() {
		assertEquals("325-692-3608", customers.get(337).getPhone());
	}

	@Test
	@DisplayName("Record 338: Fax is 325-692-9154")
	void FaxOfRecord338() {
		assertEquals("325-692-9154", customers.get(337).getFax());
	}

	@Test
	@DisplayName("Record 338: Email is tessa@melian.com")
	void EmailOfRecord338() {
		assertEquals("tessa@melian.com", customers.get(337).getEmail());
	}

	@Test
	@DisplayName("Record 338: Web is http://www.tessamelian.com")
	void WebOfRecord338() {
		assertEquals("http://www.tessamelian.com", customers.get(337).getWeb());
	}
}
