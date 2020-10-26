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
class Record_3079 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3079: FirstName is Andrea")
	void FirstNameOfRecord3079() {
		assertEquals("Andrea", customers.get(3078).getFirstName());
	}

	@Test
	@DisplayName("Record 3079: LastName is Pavlik")
	void LastNameOfRecord3079() {
		assertEquals("Pavlik", customers.get(3078).getLastName());
	}

	@Test
	@DisplayName("Record 3079: Company is Cal Western Hydraulics Inc")
	void CompanyOfRecord3079() {
		assertEquals("Cal Western Hydraulics Inc", customers.get(3078).getCompany());
	}

	@Test
	@DisplayName("Record 3079: Address is 11 E Plaza St")
	void AddressOfRecord3079() {
		assertEquals("11 E Plaza St", customers.get(3078).getAddress());
	}

	@Test
	@DisplayName("Record 3079: City is Reno")
	void CityOfRecord3079() {
		assertEquals("Reno", customers.get(3078).getCity());
	}

	@Test
	@DisplayName("Record 3079: County is Washoe")
	void CountyOfRecord3079() {
		assertEquals("Washoe", customers.get(3078).getCounty());
	}

	@Test
	@DisplayName("Record 3079: State is NV")
	void StateOfRecord3079() {
		assertEquals("NV", customers.get(3078).getState());
	}

	@Test
	@DisplayName("Record 3079: ZIP is 89501")
	void ZIPOfRecord3079() {
		assertEquals("89501", customers.get(3078).getZIP());
	}

	@Test
	@DisplayName("Record 3079: Phone is 775-329-8236")
	void PhoneOfRecord3079() {
		assertEquals("775-329-8236", customers.get(3078).getPhone());
	}

	@Test
	@DisplayName("Record 3079: Fax is 775-329-2682")
	void FaxOfRecord3079() {
		assertEquals("775-329-2682", customers.get(3078).getFax());
	}

	@Test
	@DisplayName("Record 3079: Email is andrea@pavlik.com")
	void EmailOfRecord3079() {
		assertEquals("andrea@pavlik.com", customers.get(3078).getEmail());
	}

	@Test
	@DisplayName("Record 3079: Web is http://www.andreapavlik.com")
	void WebOfRecord3079() {
		assertEquals("http://www.andreapavlik.com", customers.get(3078).getWeb());
	}
}
