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

@Tag("38")
class Record_2903 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2903: FirstName is Wes")
	void FirstNameOfRecord2903() {
		assertEquals("Wes", customers.get(2902).getFirstName());
	}

	@Test
	@DisplayName("Record 2903: LastName is Tome")
	void LastNameOfRecord2903() {
		assertEquals("Tome", customers.get(2902).getLastName());
	}

	@Test
	@DisplayName("Record 2903: Company is Wonder Bread Hostess Cakes")
	void CompanyOfRecord2903() {
		assertEquals("Wonder Bread Hostess Cakes", customers.get(2902).getCompany());
	}

	@Test
	@DisplayName("Record 2903: Address is 500 W 41st Ave")
	void AddressOfRecord2903() {
		assertEquals("500 W 41st Ave", customers.get(2902).getAddress());
	}

	@Test
	@DisplayName("Record 2903: City is Anchorage")
	void CityOfRecord2903() {
		assertEquals("Anchorage", customers.get(2902).getCity());
	}

	@Test
	@DisplayName("Record 2903: County is Anchorage")
	void CountyOfRecord2903() {
		assertEquals("Anchorage", customers.get(2902).getCounty());
	}

	@Test
	@DisplayName("Record 2903: State is AK")
	void StateOfRecord2903() {
		assertEquals("AK", customers.get(2902).getState());
	}

	@Test
	@DisplayName("Record 2903: ZIP is 99503")
	void ZIPOfRecord2903() {
		assertEquals("99503", customers.get(2902).getZIP());
	}

	@Test
	@DisplayName("Record 2903: Phone is 907-562-9082")
	void PhoneOfRecord2903() {
		assertEquals("907-562-9082", customers.get(2902).getPhone());
	}

	@Test
	@DisplayName("Record 2903: Fax is 907-562-2986")
	void FaxOfRecord2903() {
		assertEquals("907-562-2986", customers.get(2902).getFax());
	}

	@Test
	@DisplayName("Record 2903: Email is wes@tome.com")
	void EmailOfRecord2903() {
		assertEquals("wes@tome.com", customers.get(2902).getEmail());
	}

	@Test
	@DisplayName("Record 2903: Web is http://www.westome.com")
	void WebOfRecord2903() {
		assertEquals("http://www.westome.com", customers.get(2902).getWeb());
	}
}
