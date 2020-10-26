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

@Tag("32")
class Record_271 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 271: FirstName is Carla")
	void FirstNameOfRecord271() {
		assertEquals("Carla", customers.get(270).getFirstName());
	}

	@Test
	@DisplayName("Record 271: LastName is Duttinger")
	void LastNameOfRecord271() {
		assertEquals("Duttinger", customers.get(270).getLastName());
	}

	@Test
	@DisplayName("Record 271: Company is Publishers Network Inc")
	void CompanyOfRecord271() {
		assertEquals("Publishers Network Inc", customers.get(270).getCompany());
	}

	@Test
	@DisplayName("Record 271: Address is 2550 Us Highway 23s S")
	void AddressOfRecord271() {
		assertEquals("2550 Us Highway 23s S", customers.get(270).getAddress());
	}

	@Test
	@DisplayName("Record 271: City is Alpena")
	void CityOfRecord271() {
		assertEquals("Alpena", customers.get(270).getCity());
	}

	@Test
	@DisplayName("Record 271: County is Alpena")
	void CountyOfRecord271() {
		assertEquals("Alpena", customers.get(270).getCounty());
	}

	@Test
	@DisplayName("Record 271: State is MI")
	void StateOfRecord271() {
		assertEquals("MI", customers.get(270).getState());
	}

	@Test
	@DisplayName("Record 271: ZIP is 49707")
	void ZIPOfRecord271() {
		assertEquals("49707", customers.get(270).getZIP());
	}

	@Test
	@DisplayName("Record 271: Phone is 989-356-8643")
	void PhoneOfRecord271() {
		assertEquals("989-356-8643", customers.get(270).getPhone());
	}

	@Test
	@DisplayName("Record 271: Fax is 989-356-9223")
	void FaxOfRecord271() {
		assertEquals("989-356-9223", customers.get(270).getFax());
	}

	@Test
	@DisplayName("Record 271: Email is carla@duttinger.com")
	void EmailOfRecord271() {
		assertEquals("carla@duttinger.com", customers.get(270).getEmail());
	}

	@Test
	@DisplayName("Record 271: Web is http://www.carladuttinger.com")
	void WebOfRecord271() {
		assertEquals("http://www.carladuttinger.com", customers.get(270).getWeb());
	}
}
