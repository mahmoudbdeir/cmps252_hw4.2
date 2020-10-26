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

@Tag("45")
class Record_2584 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2584: FirstName is Miles")
	void FirstNameOfRecord2584() {
		assertEquals("Miles", customers.get(2583).getFirstName());
	}

	@Test
	@DisplayName("Record 2584: LastName is Gabeline")
	void LastNameOfRecord2584() {
		assertEquals("Gabeline", customers.get(2583).getLastName());
	}

	@Test
	@DisplayName("Record 2584: Company is Dunham, Kathleen Esq")
	void CompanyOfRecord2584() {
		assertEquals("Dunham, Kathleen Esq", customers.get(2583).getCompany());
	}

	@Test
	@DisplayName("Record 2584: Address is 3445 Poplar Ave  #-17")
	void AddressOfRecord2584() {
		assertEquals("3445 Poplar Ave  #-17", customers.get(2583).getAddress());
	}

	@Test
	@DisplayName("Record 2584: City is Memphis")
	void CityOfRecord2584() {
		assertEquals("Memphis", customers.get(2583).getCity());
	}

	@Test
	@DisplayName("Record 2584: County is Shelby")
	void CountyOfRecord2584() {
		assertEquals("Shelby", customers.get(2583).getCounty());
	}

	@Test
	@DisplayName("Record 2584: State is TN")
	void StateOfRecord2584() {
		assertEquals("TN", customers.get(2583).getState());
	}

	@Test
	@DisplayName("Record 2584: ZIP is 38111")
	void ZIPOfRecord2584() {
		assertEquals("38111", customers.get(2583).getZIP());
	}

	@Test
	@DisplayName("Record 2584: Phone is 901-452-5945")
	void PhoneOfRecord2584() {
		assertEquals("901-452-5945", customers.get(2583).getPhone());
	}

	@Test
	@DisplayName("Record 2584: Fax is 901-452-5724")
	void FaxOfRecord2584() {
		assertEquals("901-452-5724", customers.get(2583).getFax());
	}

	@Test
	@DisplayName("Record 2584: Email is miles@gabeline.com")
	void EmailOfRecord2584() {
		assertEquals("miles@gabeline.com", customers.get(2583).getEmail());
	}

	@Test
	@DisplayName("Record 2584: Web is http://www.milesgabeline.com")
	void WebOfRecord2584() {
		assertEquals("http://www.milesgabeline.com", customers.get(2583).getWeb());
	}
}
