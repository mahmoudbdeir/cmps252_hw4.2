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
class Record_4359 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4359: FirstName is John")
	void FirstNameOfRecord4359() {
		assertEquals("John", customers.get(4358).getFirstName());
	}

	@Test
	@DisplayName("Record 4359: LastName is Garff")
	void LastNameOfRecord4359() {
		assertEquals("Garff", customers.get(4358).getLastName());
	}

	@Test
	@DisplayName("Record 4359: Company is Farmers Ins Grp Connole Agcy")
	void CompanyOfRecord4359() {
		assertEquals("Farmers Ins Grp Connole Agcy", customers.get(4358).getCompany());
	}

	@Test
	@DisplayName("Record 4359: Address is 85 Livingston Ave")
	void AddressOfRecord4359() {
		assertEquals("85 Livingston Ave", customers.get(4358).getAddress());
	}

	@Test
	@DisplayName("Record 4359: City is Roseland")
	void CityOfRecord4359() {
		assertEquals("Roseland", customers.get(4358).getCity());
	}

	@Test
	@DisplayName("Record 4359: County is Essex")
	void CountyOfRecord4359() {
		assertEquals("Essex", customers.get(4358).getCounty());
	}

	@Test
	@DisplayName("Record 4359: State is NJ")
	void StateOfRecord4359() {
		assertEquals("NJ", customers.get(4358).getState());
	}

	@Test
	@DisplayName("Record 4359: ZIP is 7068")
	void ZIPOfRecord4359() {
		assertEquals("7068", customers.get(4358).getZIP());
	}

	@Test
	@DisplayName("Record 4359: Phone is 973-992-7759")
	void PhoneOfRecord4359() {
		assertEquals("973-992-7759", customers.get(4358).getPhone());
	}

	@Test
	@DisplayName("Record 4359: Fax is 973-992-3127")
	void FaxOfRecord4359() {
		assertEquals("973-992-3127", customers.get(4358).getFax());
	}

	@Test
	@DisplayName("Record 4359: Email is john@garff.com")
	void EmailOfRecord4359() {
		assertEquals("john@garff.com", customers.get(4358).getEmail());
	}

	@Test
	@DisplayName("Record 4359: Web is http://www.johngarff.com")
	void WebOfRecord4359() {
		assertEquals("http://www.johngarff.com", customers.get(4358).getWeb());
	}
}
