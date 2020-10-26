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

@Tag("16")
class Record_1181 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1181: FirstName is Violet")
	void FirstNameOfRecord1181() {
		assertEquals("Violet", customers.get(1180).getFirstName());
	}

	@Test
	@DisplayName("Record 1181: LastName is Shover")
	void LastNameOfRecord1181() {
		assertEquals("Shover", customers.get(1180).getLastName());
	}

	@Test
	@DisplayName("Record 1181: Company is Grillo, Phillip E Esq")
	void CompanyOfRecord1181() {
		assertEquals("Grillo, Phillip E Esq", customers.get(1180).getCompany());
	}

	@Test
	@DisplayName("Record 1181: Address is Box #-428")
	void AddressOfRecord1181() {
		assertEquals("Box #-428", customers.get(1180).getAddress());
	}

	@Test
	@DisplayName("Record 1181: City is Dunn")
	void CityOfRecord1181() {
		assertEquals("Dunn", customers.get(1180).getCity());
	}

	@Test
	@DisplayName("Record 1181: County is Harnett")
	void CountyOfRecord1181() {
		assertEquals("Harnett", customers.get(1180).getCounty());
	}

	@Test
	@DisplayName("Record 1181: State is NC")
	void StateOfRecord1181() {
		assertEquals("NC", customers.get(1180).getState());
	}

	@Test
	@DisplayName("Record 1181: ZIP is 28335")
	void ZIPOfRecord1181() {
		assertEquals("28335", customers.get(1180).getZIP());
	}

	@Test
	@DisplayName("Record 1181: Phone is 910-567-7474")
	void PhoneOfRecord1181() {
		assertEquals("910-567-7474", customers.get(1180).getPhone());
	}

	@Test
	@DisplayName("Record 1181: Fax is 910-567-2411")
	void FaxOfRecord1181() {
		assertEquals("910-567-2411", customers.get(1180).getFax());
	}

	@Test
	@DisplayName("Record 1181: Email is violet@shover.com")
	void EmailOfRecord1181() {
		assertEquals("violet@shover.com", customers.get(1180).getEmail());
	}

	@Test
	@DisplayName("Record 1181: Web is http://www.violetshover.com")
	void WebOfRecord1181() {
		assertEquals("http://www.violetshover.com", customers.get(1180).getWeb());
	}
}
