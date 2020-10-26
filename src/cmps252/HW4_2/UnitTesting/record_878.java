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
class Record_878 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 878: FirstName is Lupe")
	void FirstNameOfRecord878() {
		assertEquals("Lupe", customers.get(877).getFirstName());
	}

	@Test
	@DisplayName("Record 878: LastName is Menousek")
	void LastNameOfRecord878() {
		assertEquals("Menousek", customers.get(877).getLastName());
	}

	@Test
	@DisplayName("Record 878: Company is Park Station Condominium Hotel")
	void CompanyOfRecord878() {
		assertEquals("Park Station Condominium Hotel", customers.get(877).getCompany());
	}

	@Test
	@DisplayName("Record 878: Address is 6922 180th St")
	void AddressOfRecord878() {
		assertEquals("6922 180th St", customers.get(877).getAddress());
	}

	@Test
	@DisplayName("Record 878: City is Fresh Meadows")
	void CityOfRecord878() {
		assertEquals("Fresh Meadows", customers.get(877).getCity());
	}

	@Test
	@DisplayName("Record 878: County is Queens")
	void CountyOfRecord878() {
		assertEquals("Queens", customers.get(877).getCounty());
	}

	@Test
	@DisplayName("Record 878: State is NY")
	void StateOfRecord878() {
		assertEquals("NY", customers.get(877).getState());
	}

	@Test
	@DisplayName("Record 878: ZIP is 11365")
	void ZIPOfRecord878() {
		assertEquals("11365", customers.get(877).getZIP());
	}

	@Test
	@DisplayName("Record 878: Phone is 718-969-0784")
	void PhoneOfRecord878() {
		assertEquals("718-969-0784", customers.get(877).getPhone());
	}

	@Test
	@DisplayName("Record 878: Fax is 718-969-2878")
	void FaxOfRecord878() {
		assertEquals("718-969-2878", customers.get(877).getFax());
	}

	@Test
	@DisplayName("Record 878: Email is lupe@menousek.com")
	void EmailOfRecord878() {
		assertEquals("lupe@menousek.com", customers.get(877).getEmail());
	}

	@Test
	@DisplayName("Record 878: Web is http://www.lupemenousek.com")
	void WebOfRecord878() {
		assertEquals("http://www.lupemenousek.com", customers.get(877).getWeb());
	}
}
