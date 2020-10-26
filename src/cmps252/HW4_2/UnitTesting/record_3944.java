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

@Tag("36")
class Record_3944 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3944: FirstName is Fanny")
	void FirstNameOfRecord3944() {
		assertEquals("Fanny", customers.get(3943).getFirstName());
	}

	@Test
	@DisplayName("Record 3944: LastName is Favro")
	void LastNameOfRecord3944() {
		assertEquals("Favro", customers.get(3943).getLastName());
	}

	@Test
	@DisplayName("Record 3944: Company is Chgo Titl Agcy Mahoning Cnty")
	void CompanyOfRecord3944() {
		assertEquals("Chgo Titl Agcy Mahoning Cnty", customers.get(3943).getCompany());
	}

	@Test
	@DisplayName("Record 3944: Address is 123 Tapp St")
	void AddressOfRecord3944() {
		assertEquals("123 Tapp St", customers.get(3943).getAddress());
	}

	@Test
	@DisplayName("Record 3944: City is Pittsburg")
	void CityOfRecord3944() {
		assertEquals("Pittsburg", customers.get(3943).getCity());
	}

	@Test
	@DisplayName("Record 3944: County is Camp")
	void CountyOfRecord3944() {
		assertEquals("Camp", customers.get(3943).getCounty());
	}

	@Test
	@DisplayName("Record 3944: State is TX")
	void StateOfRecord3944() {
		assertEquals("TX", customers.get(3943).getState());
	}

	@Test
	@DisplayName("Record 3944: ZIP is 75686")
	void ZIPOfRecord3944() {
		assertEquals("75686", customers.get(3943).getZIP());
	}

	@Test
	@DisplayName("Record 3944: Phone is 903-856-2402")
	void PhoneOfRecord3944() {
		assertEquals("903-856-2402", customers.get(3943).getPhone());
	}

	@Test
	@DisplayName("Record 3944: Fax is 903-856-1011")
	void FaxOfRecord3944() {
		assertEquals("903-856-1011", customers.get(3943).getFax());
	}

	@Test
	@DisplayName("Record 3944: Email is fanny@favro.com")
	void EmailOfRecord3944() {
		assertEquals("fanny@favro.com", customers.get(3943).getEmail());
	}

	@Test
	@DisplayName("Record 3944: Web is http://www.fannyfavro.com")
	void WebOfRecord3944() {
		assertEquals("http://www.fannyfavro.com", customers.get(3943).getWeb());
	}
}
