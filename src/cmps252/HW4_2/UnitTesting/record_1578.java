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
class Record_1578 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1578: FirstName is Cristopher")
	void FirstNameOfRecord1578() {
		assertEquals("Cristopher", customers.get(1577).getFirstName());
	}

	@Test
	@DisplayName("Record 1578: LastName is Seelig")
	void LastNameOfRecord1578() {
		assertEquals("Seelig", customers.get(1577).getLastName());
	}

	@Test
	@DisplayName("Record 1578: Company is Iowa Jaycee State Headquarters")
	void CompanyOfRecord1578() {
		assertEquals("Iowa Jaycee State Headquarters", customers.get(1577).getCompany());
	}

	@Test
	@DisplayName("Record 1578: Address is 540 Doremus Ave")
	void AddressOfRecord1578() {
		assertEquals("540 Doremus Ave", customers.get(1577).getAddress());
	}

	@Test
	@DisplayName("Record 1578: City is Newark")
	void CityOfRecord1578() {
		assertEquals("Newark", customers.get(1577).getCity());
	}

	@Test
	@DisplayName("Record 1578: County is Essex")
	void CountyOfRecord1578() {
		assertEquals("Essex", customers.get(1577).getCounty());
	}

	@Test
	@DisplayName("Record 1578: State is NJ")
	void StateOfRecord1578() {
		assertEquals("NJ", customers.get(1577).getState());
	}

	@Test
	@DisplayName("Record 1578: ZIP is 07105")
	void ZIPOfRecord1578() {
		assertEquals("07105", customers.get(1577).getZIP());
	}

	@Test
	@DisplayName("Record 1578: Phone is 973-589-2863")
	void PhoneOfRecord1578() {
		assertEquals("973-589-2863", customers.get(1577).getPhone());
	}

	@Test
	@DisplayName("Record 1578: Fax is 973-589-3061")
	void FaxOfRecord1578() {
		assertEquals("973-589-3061", customers.get(1577).getFax());
	}

	@Test
	@DisplayName("Record 1578: Email is cristopher@seelig.com")
	void EmailOfRecord1578() {
		assertEquals("cristopher@seelig.com", customers.get(1577).getEmail());
	}

	@Test
	@DisplayName("Record 1578: Web is http://www.cristopherseelig.com")
	void WebOfRecord1578() {
		assertEquals("http://www.cristopherseelig.com", customers.get(1577).getWeb());
	}
}
