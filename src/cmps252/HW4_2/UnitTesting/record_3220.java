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

@Tag("30")
class Record_3220 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3220: FirstName is Carson")
	void FirstNameOfRecord3220() {
		assertEquals("Carson", customers.get(3219).getFirstName());
	}

	@Test
	@DisplayName("Record 3220: LastName is Oquendo")
	void LastNameOfRecord3220() {
		assertEquals("Oquendo", customers.get(3219).getLastName());
	}

	@Test
	@DisplayName("Record 3220: Company is N Y B Enterprises Corp")
	void CompanyOfRecord3220() {
		assertEquals("N Y B Enterprises Corp", customers.get(3219).getCompany());
	}

	@Test
	@DisplayName("Record 3220: Address is 99 Ford Ln")
	void AddressOfRecord3220() {
		assertEquals("99 Ford Ln", customers.get(3219).getAddress());
	}

	@Test
	@DisplayName("Record 3220: City is Hazelwood")
	void CityOfRecord3220() {
		assertEquals("Hazelwood", customers.get(3219).getCity());
	}

	@Test
	@DisplayName("Record 3220: County is Saint Louis")
	void CountyOfRecord3220() {
		assertEquals("Saint Louis", customers.get(3219).getCounty());
	}

	@Test
	@DisplayName("Record 3220: State is MO")
	void StateOfRecord3220() {
		assertEquals("MO", customers.get(3219).getState());
	}

	@Test
	@DisplayName("Record 3220: ZIP is 63042")
	void ZIPOfRecord3220() {
		assertEquals("63042", customers.get(3219).getZIP());
	}

	@Test
	@DisplayName("Record 3220: Phone is 314-731-2729")
	void PhoneOfRecord3220() {
		assertEquals("314-731-2729", customers.get(3219).getPhone());
	}

	@Test
	@DisplayName("Record 3220: Fax is 314-731-5304")
	void FaxOfRecord3220() {
		assertEquals("314-731-5304", customers.get(3219).getFax());
	}

	@Test
	@DisplayName("Record 3220: Email is carson@oquendo.com")
	void EmailOfRecord3220() {
		assertEquals("carson@oquendo.com", customers.get(3219).getEmail());
	}

	@Test
	@DisplayName("Record 3220: Web is http://www.carsonoquendo.com")
	void WebOfRecord3220() {
		assertEquals("http://www.carsonoquendo.com", customers.get(3219).getWeb());
	}
}
