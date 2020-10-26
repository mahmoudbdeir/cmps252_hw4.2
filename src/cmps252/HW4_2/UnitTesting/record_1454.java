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

@Tag("24")
class Record_1454 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1454: FirstName is Letha")
	void FirstNameOfRecord1454() {
		assertEquals("Letha", customers.get(1453).getFirstName());
	}

	@Test
	@DisplayName("Record 1454: LastName is Cregar")
	void LastNameOfRecord1454() {
		assertEquals("Cregar", customers.get(1453).getLastName());
	}

	@Test
	@DisplayName("Record 1454: Company is Dorsey & Whitney")
	void CompanyOfRecord1454() {
		assertEquals("Dorsey & Whitney", customers.get(1453).getCompany());
	}

	@Test
	@DisplayName("Record 1454: Address is 6520 212th St Sw")
	void AddressOfRecord1454() {
		assertEquals("6520 212th St Sw", customers.get(1453).getAddress());
	}

	@Test
	@DisplayName("Record 1454: City is Lynnwood")
	void CityOfRecord1454() {
		assertEquals("Lynnwood", customers.get(1453).getCity());
	}

	@Test
	@DisplayName("Record 1454: County is Snohomish")
	void CountyOfRecord1454() {
		assertEquals("Snohomish", customers.get(1453).getCounty());
	}

	@Test
	@DisplayName("Record 1454: State is WA")
	void StateOfRecord1454() {
		assertEquals("WA", customers.get(1453).getState());
	}

	@Test
	@DisplayName("Record 1454: ZIP is 98036")
	void ZIPOfRecord1454() {
		assertEquals("98036", customers.get(1453).getZIP());
	}

	@Test
	@DisplayName("Record 1454: Phone is 425-672-5018")
	void PhoneOfRecord1454() {
		assertEquals("425-672-5018", customers.get(1453).getPhone());
	}

	@Test
	@DisplayName("Record 1454: Fax is 425-672-0237")
	void FaxOfRecord1454() {
		assertEquals("425-672-0237", customers.get(1453).getFax());
	}

	@Test
	@DisplayName("Record 1454: Email is letha@cregar.com")
	void EmailOfRecord1454() {
		assertEquals("letha@cregar.com", customers.get(1453).getEmail());
	}

	@Test
	@DisplayName("Record 1454: Web is http://www.lethacregar.com")
	void WebOfRecord1454() {
		assertEquals("http://www.lethacregar.com", customers.get(1453).getWeb());
	}
}
