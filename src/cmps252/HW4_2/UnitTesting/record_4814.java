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

@Tag("34")
class Record_4814 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4814: FirstName is Aurora")
	void FirstNameOfRecord4814() {
		assertEquals("Aurora", customers.get(4813).getFirstName());
	}

	@Test
	@DisplayName("Record 4814: LastName is Sawka")
	void LastNameOfRecord4814() {
		assertEquals("Sawka", customers.get(4813).getLastName());
	}

	@Test
	@DisplayName("Record 4814: Company is Schoolcraft College")
	void CompanyOfRecord4814() {
		assertEquals("Schoolcraft College", customers.get(4813).getCompany());
	}

	@Test
	@DisplayName("Record 4814: Address is 510 N Bellview Ave")
	void AddressOfRecord4814() {
		assertEquals("510 N Bellview Ave", customers.get(4813).getAddress());
	}

	@Test
	@DisplayName("Record 4814: City is Riverton")
	void CityOfRecord4814() {
		assertEquals("Riverton", customers.get(4813).getCity());
	}

	@Test
	@DisplayName("Record 4814: County is Burlington")
	void CountyOfRecord4814() {
		assertEquals("Burlington", customers.get(4813).getCounty());
	}

	@Test
	@DisplayName("Record 4814: State is NJ")
	void StateOfRecord4814() {
		assertEquals("NJ", customers.get(4813).getState());
	}

	@Test
	@DisplayName("Record 4814: ZIP is 8077")
	void ZIPOfRecord4814() {
		assertEquals("8077", customers.get(4813).getZIP());
	}

	@Test
	@DisplayName("Record 4814: Phone is 856-829-4376")
	void PhoneOfRecord4814() {
		assertEquals("856-829-4376", customers.get(4813).getPhone());
	}

	@Test
	@DisplayName("Record 4814: Fax is 856-829-3837")
	void FaxOfRecord4814() {
		assertEquals("856-829-3837", customers.get(4813).getFax());
	}

	@Test
	@DisplayName("Record 4814: Email is aurora@sawka.com")
	void EmailOfRecord4814() {
		assertEquals("aurora@sawka.com", customers.get(4813).getEmail());
	}

	@Test
	@DisplayName("Record 4814: Web is http://www.aurorasawka.com")
	void WebOfRecord4814() {
		assertEquals("http://www.aurorasawka.com", customers.get(4813).getWeb());
	}
}
