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

@Tag("40")
class Record_3825 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3825: FirstName is Larry")
	void FirstNameOfRecord3825() {
		assertEquals("Larry", customers.get(3824).getFirstName());
	}

	@Test
	@DisplayName("Record 3825: LastName is Fonohema")
	void LastNameOfRecord3825() {
		assertEquals("Fonohema", customers.get(3824).getLastName());
	}

	@Test
	@DisplayName("Record 3825: Company is Mckelvey, James A Esq")
	void CompanyOfRecord3825() {
		assertEquals("Mckelvey, James A Esq", customers.get(3824).getCompany());
	}

	@Test
	@DisplayName("Record 3825: Address is 407 N Randolph Ave")
	void AddressOfRecord3825() {
		assertEquals("407 N Randolph Ave", customers.get(3824).getAddress());
	}

	@Test
	@DisplayName("Record 3825: City is Riverton")
	void CityOfRecord3825() {
		assertEquals("Riverton", customers.get(3824).getCity());
	}

	@Test
	@DisplayName("Record 3825: County is Burlington")
	void CountyOfRecord3825() {
		assertEquals("Burlington", customers.get(3824).getCounty());
	}

	@Test
	@DisplayName("Record 3825: State is NJ")
	void StateOfRecord3825() {
		assertEquals("NJ", customers.get(3824).getState());
	}

	@Test
	@DisplayName("Record 3825: ZIP is 8077")
	void ZIPOfRecord3825() {
		assertEquals("8077", customers.get(3824).getZIP());
	}

	@Test
	@DisplayName("Record 3825: Phone is 856-829-0757")
	void PhoneOfRecord3825() {
		assertEquals("856-829-0757", customers.get(3824).getPhone());
	}

	@Test
	@DisplayName("Record 3825: Fax is 856-829-3647")
	void FaxOfRecord3825() {
		assertEquals("856-829-3647", customers.get(3824).getFax());
	}

	@Test
	@DisplayName("Record 3825: Email is larry@fonohema.com")
	void EmailOfRecord3825() {
		assertEquals("larry@fonohema.com", customers.get(3824).getEmail());
	}

	@Test
	@DisplayName("Record 3825: Web is http://www.larryfonohema.com")
	void WebOfRecord3825() {
		assertEquals("http://www.larryfonohema.com", customers.get(3824).getWeb());
	}
}
