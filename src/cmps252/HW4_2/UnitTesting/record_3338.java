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

@Tag("46")
class Record_3338 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3338: FirstName is Freddie")
	void FirstNameOfRecord3338() {
		assertEquals("Freddie", customers.get(3337).getFirstName());
	}

	@Test
	@DisplayName("Record 3338: LastName is Postle")
	void LastNameOfRecord3338() {
		assertEquals("Postle", customers.get(3337).getLastName());
	}

	@Test
	@DisplayName("Record 3338: Company is General Packaging Corp")
	void CompanyOfRecord3338() {
		assertEquals("General Packaging Corp", customers.get(3337).getCompany());
	}

	@Test
	@DisplayName("Record 3338: Address is 2211 E Northern Lights Blvd")
	void AddressOfRecord3338() {
		assertEquals("2211 E Northern Lights Blvd", customers.get(3337).getAddress());
	}

	@Test
	@DisplayName("Record 3338: City is Anchorage")
	void CityOfRecord3338() {
		assertEquals("Anchorage", customers.get(3337).getCity());
	}

	@Test
	@DisplayName("Record 3338: County is Anchorage")
	void CountyOfRecord3338() {
		assertEquals("Anchorage", customers.get(3337).getCounty());
	}

	@Test
	@DisplayName("Record 3338: State is AK")
	void StateOfRecord3338() {
		assertEquals("AK", customers.get(3337).getState());
	}

	@Test
	@DisplayName("Record 3338: ZIP is 99508")
	void ZIPOfRecord3338() {
		assertEquals("99508", customers.get(3337).getZIP());
	}

	@Test
	@DisplayName("Record 3338: Phone is 907-258-2623")
	void PhoneOfRecord3338() {
		assertEquals("907-258-2623", customers.get(3337).getPhone());
	}

	@Test
	@DisplayName("Record 3338: Fax is 907-258-0979")
	void FaxOfRecord3338() {
		assertEquals("907-258-0979", customers.get(3337).getFax());
	}

	@Test
	@DisplayName("Record 3338: Email is freddie@postle.com")
	void EmailOfRecord3338() {
		assertEquals("freddie@postle.com", customers.get(3337).getEmail());
	}

	@Test
	@DisplayName("Record 3338: Web is http://www.freddiepostle.com")
	void WebOfRecord3338() {
		assertEquals("http://www.freddiepostle.com", customers.get(3337).getWeb());
	}
}
