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

@Tag("39")
class Record_4028 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4028: FirstName is Erlinda")
	void FirstNameOfRecord4028() {
		assertEquals("Erlinda", customers.get(4027).getFirstName());
	}

	@Test
	@DisplayName("Record 4028: LastName is Simelton")
	void LastNameOfRecord4028() {
		assertEquals("Simelton", customers.get(4027).getLastName());
	}

	@Test
	@DisplayName("Record 4028: Company is Robinson, Norwood Esq")
	void CompanyOfRecord4028() {
		assertEquals("Robinson, Norwood Esq", customers.get(4027).getCompany());
	}

	@Test
	@DisplayName("Record 4028: Address is 2810 International Cir")
	void AddressOfRecord4028() {
		assertEquals("2810 International Cir", customers.get(4027).getAddress());
	}

	@Test
	@DisplayName("Record 4028: City is Colorado Springs")
	void CityOfRecord4028() {
		assertEquals("Colorado Springs", customers.get(4027).getCity());
	}

	@Test
	@DisplayName("Record 4028: County is El Paso")
	void CountyOfRecord4028() {
		assertEquals("El Paso", customers.get(4027).getCounty());
	}

	@Test
	@DisplayName("Record 4028: State is CO")
	void StateOfRecord4028() {
		assertEquals("CO", customers.get(4027).getState());
	}

	@Test
	@DisplayName("Record 4028: ZIP is 80910")
	void ZIPOfRecord4028() {
		assertEquals("80910", customers.get(4027).getZIP());
	}

	@Test
	@DisplayName("Record 4028: Phone is 719-520-2915")
	void PhoneOfRecord4028() {
		assertEquals("719-520-2915", customers.get(4027).getPhone());
	}

	@Test
	@DisplayName("Record 4028: Fax is 719-520-0008")
	void FaxOfRecord4028() {
		assertEquals("719-520-0008", customers.get(4027).getFax());
	}

	@Test
	@DisplayName("Record 4028: Email is erlinda@simelton.com")
	void EmailOfRecord4028() {
		assertEquals("erlinda@simelton.com", customers.get(4027).getEmail());
	}

	@Test
	@DisplayName("Record 4028: Web is http://www.erlindasimelton.com")
	void WebOfRecord4028() {
		assertEquals("http://www.erlindasimelton.com", customers.get(4027).getWeb());
	}
}
