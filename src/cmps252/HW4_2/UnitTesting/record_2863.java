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

@Tag("20")
class Record_2863 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2863: FirstName is Efrain")
	void FirstNameOfRecord2863() {
		assertEquals("Efrain", customers.get(2862).getFirstName());
	}

	@Test
	@DisplayName("Record 2863: LastName is Moder")
	void LastNameOfRecord2863() {
		assertEquals("Moder", customers.get(2862).getLastName());
	}

	@Test
	@DisplayName("Record 2863: Company is Fay Flynn & Fay")
	void CompanyOfRecord2863() {
		assertEquals("Fay Flynn & Fay", customers.get(2862).getCompany());
	}

	@Test
	@DisplayName("Record 2863: Address is 4001 Laurel St")
	void AddressOfRecord2863() {
		assertEquals("4001 Laurel St", customers.get(2862).getAddress());
	}

	@Test
	@DisplayName("Record 2863: City is Anchorage")
	void CityOfRecord2863() {
		assertEquals("Anchorage", customers.get(2862).getCity());
	}

	@Test
	@DisplayName("Record 2863: County is Anchorage")
	void CountyOfRecord2863() {
		assertEquals("Anchorage", customers.get(2862).getCounty());
	}

	@Test
	@DisplayName("Record 2863: State is AK")
	void StateOfRecord2863() {
		assertEquals("AK", customers.get(2862).getState());
	}

	@Test
	@DisplayName("Record 2863: ZIP is 99508")
	void ZIPOfRecord2863() {
		assertEquals("99508", customers.get(2862).getZIP());
	}

	@Test
	@DisplayName("Record 2863: Phone is 907-563-0208")
	void PhoneOfRecord2863() {
		assertEquals("907-563-0208", customers.get(2862).getPhone());
	}

	@Test
	@DisplayName("Record 2863: Fax is 907-563-5581")
	void FaxOfRecord2863() {
		assertEquals("907-563-5581", customers.get(2862).getFax());
	}

	@Test
	@DisplayName("Record 2863: Email is efrain@moder.com")
	void EmailOfRecord2863() {
		assertEquals("efrain@moder.com", customers.get(2862).getEmail());
	}

	@Test
	@DisplayName("Record 2863: Web is http://www.efrainmoder.com")
	void WebOfRecord2863() {
		assertEquals("http://www.efrainmoder.com", customers.get(2862).getWeb());
	}
}
