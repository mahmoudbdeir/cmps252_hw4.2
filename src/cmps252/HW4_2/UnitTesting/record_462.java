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

@Tag("16")
class Record_462 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 462: FirstName is Loraine")
	void FirstNameOfRecord462() {
		assertEquals("Loraine", customers.get(461).getFirstName());
	}

	@Test
	@DisplayName("Record 462: LastName is Vandee")
	void LastNameOfRecord462() {
		assertEquals("Vandee", customers.get(461).getLastName());
	}

	@Test
	@DisplayName("Record 462: Company is Munson Williams Proctor Inst")
	void CompanyOfRecord462() {
		assertEquals("Munson Williams Proctor Inst", customers.get(461).getCompany());
	}

	@Test
	@DisplayName("Record 462: Address is 3005 W Lake Mary Blvd")
	void AddressOfRecord462() {
		assertEquals("3005 W Lake Mary Blvd", customers.get(461).getAddress());
	}

	@Test
	@DisplayName("Record 462: City is Lake Mary")
	void CityOfRecord462() {
		assertEquals("Lake Mary", customers.get(461).getCity());
	}

	@Test
	@DisplayName("Record 462: County is Seminole")
	void CountyOfRecord462() {
		assertEquals("Seminole", customers.get(461).getCounty());
	}

	@Test
	@DisplayName("Record 462: State is FL")
	void StateOfRecord462() {
		assertEquals("FL", customers.get(461).getState());
	}

	@Test
	@DisplayName("Record 462: ZIP is 32746")
	void ZIPOfRecord462() {
		assertEquals("32746", customers.get(461).getZIP());
	}

	@Test
	@DisplayName("Record 462: Phone is 407-322-9990")
	void PhoneOfRecord462() {
		assertEquals("407-322-9990", customers.get(461).getPhone());
	}

	@Test
	@DisplayName("Record 462: Fax is 407-322-9674")
	void FaxOfRecord462() {
		assertEquals("407-322-9674", customers.get(461).getFax());
	}

	@Test
	@DisplayName("Record 462: Email is loraine@vandee.com")
	void EmailOfRecord462() {
		assertEquals("loraine@vandee.com", customers.get(461).getEmail());
	}

	@Test
	@DisplayName("Record 462: Web is http://www.lorainevandee.com")
	void WebOfRecord462() {
		assertEquals("http://www.lorainevandee.com", customers.get(461).getWeb());
	}
}
