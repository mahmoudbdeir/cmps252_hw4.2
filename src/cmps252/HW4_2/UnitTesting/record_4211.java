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

@Tag("36")
class Record_4211 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4211: FirstName is Hipolito")
	void FirstNameOfRecord4211() {
		assertEquals("Hipolito", customers.get(4210).getFirstName());
	}

	@Test
	@DisplayName("Record 4211: LastName is Galeano")
	void LastNameOfRecord4211() {
		assertEquals("Galeano", customers.get(4210).getLastName());
	}

	@Test
	@DisplayName("Record 4211: Company is Midwest Continuing Care")
	void CompanyOfRecord4211() {
		assertEquals("Midwest Continuing Care", customers.get(4210).getCompany());
	}

	@Test
	@DisplayName("Record 4211: Address is 26 S Main St")
	void AddressOfRecord4211() {
		assertEquals("26 S Main St", customers.get(4210).getAddress());
	}

	@Test
	@DisplayName("Record 4211: City is Bel Air")
	void CityOfRecord4211() {
		assertEquals("Bel Air", customers.get(4210).getCity());
	}

	@Test
	@DisplayName("Record 4211: County is Harford")
	void CountyOfRecord4211() {
		assertEquals("Harford", customers.get(4210).getCounty());
	}

	@Test
	@DisplayName("Record 4211: State is MD")
	void StateOfRecord4211() {
		assertEquals("MD", customers.get(4210).getState());
	}

	@Test
	@DisplayName("Record 4211: ZIP is 21014")
	void ZIPOfRecord4211() {
		assertEquals("21014", customers.get(4210).getZIP());
	}

	@Test
	@DisplayName("Record 4211: Phone is 410-893-0114")
	void PhoneOfRecord4211() {
		assertEquals("410-893-0114", customers.get(4210).getPhone());
	}

	@Test
	@DisplayName("Record 4211: Fax is 410-893-0078")
	void FaxOfRecord4211() {
		assertEquals("410-893-0078", customers.get(4210).getFax());
	}

	@Test
	@DisplayName("Record 4211: Email is hipolito@galeano.com")
	void EmailOfRecord4211() {
		assertEquals("hipolito@galeano.com", customers.get(4210).getEmail());
	}

	@Test
	@DisplayName("Record 4211: Web is http://www.hipolitogaleano.com")
	void WebOfRecord4211() {
		assertEquals("http://www.hipolitogaleano.com", customers.get(4210).getWeb());
	}
}
