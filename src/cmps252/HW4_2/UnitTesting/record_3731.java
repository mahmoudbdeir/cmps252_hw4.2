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

@Tag("33")
class Record_3731 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3731: FirstName is Rubin")
	void FirstNameOfRecord3731() {
		assertEquals("Rubin", customers.get(3730).getFirstName());
	}

	@Test
	@DisplayName("Record 3731: LastName is Dacpano")
	void LastNameOfRecord3731() {
		assertEquals("Dacpano", customers.get(3730).getLastName());
	}

	@Test
	@DisplayName("Record 3731: Company is John W Jensen Attorney At Law")
	void CompanyOfRecord3731() {
		assertEquals("John W Jensen Attorney At Law", customers.get(3730).getCompany());
	}

	@Test
	@DisplayName("Record 3731: Address is 2929 Columbia St")
	void AddressOfRecord3731() {
		assertEquals("2929 Columbia St", customers.get(3730).getAddress());
	}

	@Test
	@DisplayName("Record 3731: City is Anchorage")
	void CityOfRecord3731() {
		assertEquals("Anchorage", customers.get(3730).getCity());
	}

	@Test
	@DisplayName("Record 3731: County is Anchorage")
	void CountyOfRecord3731() {
		assertEquals("Anchorage", customers.get(3730).getCounty());
	}

	@Test
	@DisplayName("Record 3731: State is AK")
	void StateOfRecord3731() {
		assertEquals("AK", customers.get(3730).getState());
	}

	@Test
	@DisplayName("Record 3731: ZIP is 99508")
	void ZIPOfRecord3731() {
		assertEquals("99508", customers.get(3730).getZIP());
	}

	@Test
	@DisplayName("Record 3731: Phone is 907-272-2079")
	void PhoneOfRecord3731() {
		assertEquals("907-272-2079", customers.get(3730).getPhone());
	}

	@Test
	@DisplayName("Record 3731: Fax is 907-272-4782")
	void FaxOfRecord3731() {
		assertEquals("907-272-4782", customers.get(3730).getFax());
	}

	@Test
	@DisplayName("Record 3731: Email is rubin@dacpano.com")
	void EmailOfRecord3731() {
		assertEquals("rubin@dacpano.com", customers.get(3730).getEmail());
	}

	@Test
	@DisplayName("Record 3731: Web is http://www.rubindacpano.com")
	void WebOfRecord3731() {
		assertEquals("http://www.rubindacpano.com", customers.get(3730).getWeb());
	}
}
