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
class Record_962 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 962: FirstName is Zack")
	void FirstNameOfRecord962() {
		assertEquals("Zack", customers.get(961).getFirstName());
	}

	@Test
	@DisplayName("Record 962: LastName is Vichidvongsa")
	void LastNameOfRecord962() {
		assertEquals("Vichidvongsa", customers.get(961).getLastName());
	}

	@Test
	@DisplayName("Record 962: Company is Amercn Shropshire Rgsty Assn")
	void CompanyOfRecord962() {
		assertEquals("Amercn Shropshire Rgsty Assn", customers.get(961).getCompany());
	}

	@Test
	@DisplayName("Record 962: Address is 8459 Sw 132nd St")
	void AddressOfRecord962() {
		assertEquals("8459 Sw 132nd St", customers.get(961).getAddress());
	}

	@Test
	@DisplayName("Record 962: City is Miami")
	void CityOfRecord962() {
		assertEquals("Miami", customers.get(961).getCity());
	}

	@Test
	@DisplayName("Record 962: County is Miami-Dade")
	void CountyOfRecord962() {
		assertEquals("Miami-Dade", customers.get(961).getCounty());
	}

	@Test
	@DisplayName("Record 962: State is FL")
	void StateOfRecord962() {
		assertEquals("FL", customers.get(961).getState());
	}

	@Test
	@DisplayName("Record 962: ZIP is 33156")
	void ZIPOfRecord962() {
		assertEquals("33156", customers.get(961).getZIP());
	}

	@Test
	@DisplayName("Record 962: Phone is 305-251-7883")
	void PhoneOfRecord962() {
		assertEquals("305-251-7883", customers.get(961).getPhone());
	}

	@Test
	@DisplayName("Record 962: Fax is 305-251-4494")
	void FaxOfRecord962() {
		assertEquals("305-251-4494", customers.get(961).getFax());
	}

	@Test
	@DisplayName("Record 962: Email is zack@vichidvongsa.com")
	void EmailOfRecord962() {
		assertEquals("zack@vichidvongsa.com", customers.get(961).getEmail());
	}

	@Test
	@DisplayName("Record 962: Web is http://www.zackvichidvongsa.com")
	void WebOfRecord962() {
		assertEquals("http://www.zackvichidvongsa.com", customers.get(961).getWeb());
	}
}
