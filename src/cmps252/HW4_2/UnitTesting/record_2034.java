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

@Tag("23")
class Record_2034 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2034: FirstName is Buford")
	void FirstNameOfRecord2034() {
		assertEquals("Buford", customers.get(2033).getFirstName());
	}

	@Test
	@DisplayName("Record 2034: LastName is Cocopoti")
	void LastNameOfRecord2034() {
		assertEquals("Cocopoti", customers.get(2033).getLastName());
	}

	@Test
	@DisplayName("Record 2034: Company is Talaske Group Inc")
	void CompanyOfRecord2034() {
		assertEquals("Talaske Group Inc", customers.get(2033).getCompany());
	}

	@Test
	@DisplayName("Record 2034: Address is 175 Main St  #-507")
	void AddressOfRecord2034() {
		assertEquals("175 Main St  #-507", customers.get(2033).getAddress());
	}

	@Test
	@DisplayName("Record 2034: City is White Plains")
	void CityOfRecord2034() {
		assertEquals("White Plains", customers.get(2033).getCity());
	}

	@Test
	@DisplayName("Record 2034: County is Westchester")
	void CountyOfRecord2034() {
		assertEquals("Westchester", customers.get(2033).getCounty());
	}

	@Test
	@DisplayName("Record 2034: State is NY")
	void StateOfRecord2034() {
		assertEquals("NY", customers.get(2033).getState());
	}

	@Test
	@DisplayName("Record 2034: ZIP is 10601")
	void ZIPOfRecord2034() {
		assertEquals("10601", customers.get(2033).getZIP());
	}

	@Test
	@DisplayName("Record 2034: Phone is 914-761-0394")
	void PhoneOfRecord2034() {
		assertEquals("914-761-0394", customers.get(2033).getPhone());
	}

	@Test
	@DisplayName("Record 2034: Fax is 914-761-6139")
	void FaxOfRecord2034() {
		assertEquals("914-761-6139", customers.get(2033).getFax());
	}

	@Test
	@DisplayName("Record 2034: Email is buford@cocopoti.com")
	void EmailOfRecord2034() {
		assertEquals("buford@cocopoti.com", customers.get(2033).getEmail());
	}

	@Test
	@DisplayName("Record 2034: Web is http://www.bufordcocopoti.com")
	void WebOfRecord2034() {
		assertEquals("http://www.bufordcocopoti.com", customers.get(2033).getWeb());
	}
}
