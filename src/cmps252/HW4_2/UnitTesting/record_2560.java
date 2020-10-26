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

@Tag("48")
class Record_2560 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2560: FirstName is Alphonso")
	void FirstNameOfRecord2560() {
		assertEquals("Alphonso", customers.get(2559).getFirstName());
	}

	@Test
	@DisplayName("Record 2560: LastName is Moch")
	void LastNameOfRecord2560() {
		assertEquals("Moch", customers.get(2559).getLastName());
	}

	@Test
	@DisplayName("Record 2560: Company is Signal Service Inc")
	void CompanyOfRecord2560() {
		assertEquals("Signal Service Inc", customers.get(2559).getCompany());
	}

	@Test
	@DisplayName("Record 2560: Address is 313 S Main St")
	void AddressOfRecord2560() {
		assertEquals("313 S Main St", customers.get(2559).getAddress());
	}

	@Test
	@DisplayName("Record 2560: City is Perkasie")
	void CityOfRecord2560() {
		assertEquals("Perkasie", customers.get(2559).getCity());
	}

	@Test
	@DisplayName("Record 2560: County is Bucks")
	void CountyOfRecord2560() {
		assertEquals("Bucks", customers.get(2559).getCounty());
	}

	@Test
	@DisplayName("Record 2560: State is PA")
	void StateOfRecord2560() {
		assertEquals("PA", customers.get(2559).getState());
	}

	@Test
	@DisplayName("Record 2560: ZIP is 18944")
	void ZIPOfRecord2560() {
		assertEquals("18944", customers.get(2559).getZIP());
	}

	@Test
	@DisplayName("Record 2560: Phone is 215-257-9376")
	void PhoneOfRecord2560() {
		assertEquals("215-257-9376", customers.get(2559).getPhone());
	}

	@Test
	@DisplayName("Record 2560: Fax is 215-257-2489")
	void FaxOfRecord2560() {
		assertEquals("215-257-2489", customers.get(2559).getFax());
	}

	@Test
	@DisplayName("Record 2560: Email is alphonso@moch.com")
	void EmailOfRecord2560() {
		assertEquals("alphonso@moch.com", customers.get(2559).getEmail());
	}

	@Test
	@DisplayName("Record 2560: Web is http://www.alphonsomoch.com")
	void WebOfRecord2560() {
		assertEquals("http://www.alphonsomoch.com", customers.get(2559).getWeb());
	}
}
