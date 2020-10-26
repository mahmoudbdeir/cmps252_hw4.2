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
class Record_2972 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2972: FirstName is Sid")
	void FirstNameOfRecord2972() {
		assertEquals("Sid", customers.get(2971).getFirstName());
	}

	@Test
	@DisplayName("Record 2972: LastName is Jules")
	void LastNameOfRecord2972() {
		assertEquals("Jules", customers.get(2971).getLastName());
	}

	@Test
	@DisplayName("Record 2972: Company is Neosho Savings & Loan Assn")
	void CompanyOfRecord2972() {
		assertEquals("Neosho Savings & Loan Assn", customers.get(2971).getCompany());
	}

	@Test
	@DisplayName("Record 2972: Address is 8546 Madison Ave")
	void AddressOfRecord2972() {
		assertEquals("8546 Madison Ave", customers.get(2971).getAddress());
	}

	@Test
	@DisplayName("Record 2972: City is Fair Oaks")
	void CityOfRecord2972() {
		assertEquals("Fair Oaks", customers.get(2971).getCity());
	}

	@Test
	@DisplayName("Record 2972: County is Sacramento")
	void CountyOfRecord2972() {
		assertEquals("Sacramento", customers.get(2971).getCounty());
	}

	@Test
	@DisplayName("Record 2972: State is CA")
	void StateOfRecord2972() {
		assertEquals("CA", customers.get(2971).getState());
	}

	@Test
	@DisplayName("Record 2972: ZIP is 95628")
	void ZIPOfRecord2972() {
		assertEquals("95628", customers.get(2971).getZIP());
	}

	@Test
	@DisplayName("Record 2972: Phone is 916-966-9173")
	void PhoneOfRecord2972() {
		assertEquals("916-966-9173", customers.get(2971).getPhone());
	}

	@Test
	@DisplayName("Record 2972: Fax is 916-966-5297")
	void FaxOfRecord2972() {
		assertEquals("916-966-5297", customers.get(2971).getFax());
	}

	@Test
	@DisplayName("Record 2972: Email is sid@jules.com")
	void EmailOfRecord2972() {
		assertEquals("sid@jules.com", customers.get(2971).getEmail());
	}

	@Test
	@DisplayName("Record 2972: Web is http://www.sidjules.com")
	void WebOfRecord2972() {
		assertEquals("http://www.sidjules.com", customers.get(2971).getWeb());
	}
}
