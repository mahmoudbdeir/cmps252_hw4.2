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

@Tag("3")
class Record_4992 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4992: FirstName is Meagan")
	void FirstNameOfRecord4992() {
		assertEquals("Meagan", customers.get(4991).getFirstName());
	}

	@Test
	@DisplayName("Record 4992: LastName is Stichter")
	void LastNameOfRecord4992() {
		assertEquals("Stichter", customers.get(4991).getLastName());
	}

	@Test
	@DisplayName("Record 4992: Company is Ira L Henry Co Inc")
	void CompanyOfRecord4992() {
		assertEquals("Ira L Henry Co Inc", customers.get(4991).getCompany());
	}

	@Test
	@DisplayName("Record 4992: Address is 505 N Sam Houston Pky E")
	void AddressOfRecord4992() {
		assertEquals("505 N Sam Houston Pky E", customers.get(4991).getAddress());
	}

	@Test
	@DisplayName("Record 4992: City is Houston")
	void CityOfRecord4992() {
		assertEquals("Houston", customers.get(4991).getCity());
	}

	@Test
	@DisplayName("Record 4992: County is Harris")
	void CountyOfRecord4992() {
		assertEquals("Harris", customers.get(4991).getCounty());
	}

	@Test
	@DisplayName("Record 4992: State is TX")
	void StateOfRecord4992() {
		assertEquals("TX", customers.get(4991).getState());
	}

	@Test
	@DisplayName("Record 4992: ZIP is 77060")
	void ZIPOfRecord4992() {
		assertEquals("77060", customers.get(4991).getZIP());
	}

	@Test
	@DisplayName("Record 4992: Phone is 281-820-1642")
	void PhoneOfRecord4992() {
		assertEquals("281-820-1642", customers.get(4991).getPhone());
	}

	@Test
	@DisplayName("Record 4992: Fax is 281-820-7701")
	void FaxOfRecord4992() {
		assertEquals("281-820-7701", customers.get(4991).getFax());
	}

	@Test
	@DisplayName("Record 4992: Email is meagan@stichter.com")
	void EmailOfRecord4992() {
		assertEquals("meagan@stichter.com", customers.get(4991).getEmail());
	}

	@Test
	@DisplayName("Record 4992: Web is http://www.meaganstichter.com")
	void WebOfRecord4992() {
		assertEquals("http://www.meaganstichter.com", customers.get(4991).getWeb());
	}
}
