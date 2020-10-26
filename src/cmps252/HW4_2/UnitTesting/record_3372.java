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

@Tag("32")
class Record_3372 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3372: FirstName is Giovanni")
	void FirstNameOfRecord3372() {
		assertEquals("Giovanni", customers.get(3371).getFirstName());
	}

	@Test
	@DisplayName("Record 3372: LastName is Whiteman")
	void LastNameOfRecord3372() {
		assertEquals("Whiteman", customers.get(3371).getLastName());
	}

	@Test
	@DisplayName("Record 3372: Company is James E Riley Farms Inc")
	void CompanyOfRecord3372() {
		assertEquals("James E Riley Farms Inc", customers.get(3371).getCompany());
	}

	@Test
	@DisplayName("Record 3372: Address is 70 Outwater Ln")
	void AddressOfRecord3372() {
		assertEquals("70 Outwater Ln", customers.get(3371).getAddress());
	}

	@Test
	@DisplayName("Record 3372: City is Garfield")
	void CityOfRecord3372() {
		assertEquals("Garfield", customers.get(3371).getCity());
	}

	@Test
	@DisplayName("Record 3372: County is Bergen")
	void CountyOfRecord3372() {
		assertEquals("Bergen", customers.get(3371).getCounty());
	}

	@Test
	@DisplayName("Record 3372: State is NJ")
	void StateOfRecord3372() {
		assertEquals("NJ", customers.get(3371).getState());
	}

	@Test
	@DisplayName("Record 3372: ZIP is 7026")
	void ZIPOfRecord3372() {
		assertEquals("7026", customers.get(3371).getZIP());
	}

	@Test
	@DisplayName("Record 3372: Phone is 973-772-7382")
	void PhoneOfRecord3372() {
		assertEquals("973-772-7382", customers.get(3371).getPhone());
	}

	@Test
	@DisplayName("Record 3372: Fax is 973-772-4725")
	void FaxOfRecord3372() {
		assertEquals("973-772-4725", customers.get(3371).getFax());
	}

	@Test
	@DisplayName("Record 3372: Email is giovanni@whiteman.com")
	void EmailOfRecord3372() {
		assertEquals("giovanni@whiteman.com", customers.get(3371).getEmail());
	}

	@Test
	@DisplayName("Record 3372: Web is http://www.giovanniwhiteman.com")
	void WebOfRecord3372() {
		assertEquals("http://www.giovanniwhiteman.com", customers.get(3371).getWeb());
	}
}
